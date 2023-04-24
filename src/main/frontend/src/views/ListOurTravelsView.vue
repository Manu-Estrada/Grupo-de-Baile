<script setup>
import Pagination from "../components/gallery/Pagination.vue";
import { onBeforeMount, ref, computed } from "vue";
import ApiRepository from "../assets/ApiRepository/ApiRepository.js";
import { ourTravels } from "../stores/ourTravels";
import { imageOurTravels } from "../stores/imageOurTravels";
import router from "../router/index";

const ourTravelsItem = ourTravels();
const imageOurTravelsItem = imageOurTravels();

function update(id, ourTravels, imageOurTravels) {
  ourTravelsItem.ourTravelsObject = ourTravels;
  imageOurTravelsItem.ourTravelsImageObject = imageOurTravels;
  router.push("/modificarnuestrosviajes" + "/" + id);
}

function updateImage(id, ourTravels, imageOurTravels) {
  ourTravelsItem.ourTravelsObject = ourTravels;
  imageOurTravelsItem.ourTravelsImageObject = imageOurTravels;
  router.push("/registrofotosViajes" + "/" + id);
}

const repository = new ApiRepository("nuestrosviajes");
const api = repository.chooseApi();

const travelsCardxPage = 2;
const start = ref(0);
const end = computed(() =>
  Math.min(start.value + travelsCardxPage, ourTravelsList.value.length)
);

let ourTravelsList = ref([]);
onBeforeMount(async () => {
  ourTravelsList.value = await api.getAll();
});

const ourTravelsToShow = computed(() => {
  return ourTravelsList.value.slice(start.value, end.value);
});

const next = () => {
  start.value += travelsCardxPage;
};

const prev = () => {
  start.value = Math.max(start.value - travelsCardxPage, 0);
};

const page = (algo) => {
  start.value = algo;
};

async function deletePost(id) {
  if (confirm("¿Está seguro de que quiere borrar este viaje ?") == true) {
    deleteThis(id);
  }
}

async function deleteThis(id) {
  const response = fetch(`http://localhost:8080/api/travels/${id}`, {
    method: "DELETE",
    headers: {
      "Content-Type": "application/json",
    },
  }).then((response) => {
    if (response.status == 200) {
      alert("Viaje borrado correctamente.");
      location.reload();
    } else {
      alert(
        "Se ha producido un error. \nPor favor, inténtelo de nuevo en unos minutos."
      );
    }
  });
}
</script>
<template>
  <main>
    <div
      class="card mb-3"
      v-for="ourTravels in ourTravelsToShow"
      :key="ourTravels.id"
      :member="ourTravels"
    >
      <div class="row g-0">
        <div v-if="ourTravels.imageTravel.length > 0">
          <img
            :src="`http://localhost:8080/images/travel-photos/${ourTravels.imageTravel[0].image}`"
            class="img-fluid"
            alt="..."
          />
        </div>
        <div class="text">
          <div class="text-name">
            <p class="font-date">
              <b>{{ ourTravels.datetravel }}</b>
            </p>
            <p class="font-name">
              <b>{{ ourTravels.name }}</b>
            </p>
          </div>
        </div>
        <div class="options">
          <div class="text-date">
            <div class="card-body">
              <p class="btnsUser">
                <button
                  type="button"
                  class="btn btn-danger"
                  @click="deletePost(ourTravels.id)"
                >
                  Borrar
                </button>
                <button
                  type="button"
                  class="btn btn-warning"
                  @click="
                    update(ourTravels.id, ourTravels, ourTravels.imageTravel)
                  "
                >
                  Modificar
                </button>
                <button
                  type="button"
                  class="btn btn-success"
                  @click="
                    updateImage(
                      ourTravels.id,
                      ourTravels,
                      ourTravels.imageTravel
                    )
                  "
                >
                  Imagen
                </button>
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>
    <Pagination
      :pageSize="travelsCardxPage"
      :start="start"
      :end="end"
      :maxLength="ourTravelsList.length"
      @change="page"
      @prev="prev"
      @next="next"
    />
  </main>
</template>

<style scoped lang="scss">
@import "../assets/sass/styles.scss";
@import "../assets/sass/galleryStyles/gallerystyles.scss";

main {
  padding-top: 5vw;
}
.row {
  width: 90%;
  max-width: none;
  margin: auto;
  background: #feffd7;
  display: flex;
  justify-content: space-between;
}

.row > * {
  max-width: none;
  width: auto;
}

img {
  aspect-ratio: 16/9;
  object-fit: cover;
  width: 200px;
}

.btn {
  margin: 0.3em;
  width: 5.4em;
}

.card-body {
  display: flex;
  justify-content: end;
  align-items: flex-end;
}
.text,
.text-date {
  padding: 10px;
}

.options {
  justify-self: end;
  align-self: self-end;
}

@media (max-width: 768px) {
  .row {
    flex-direction: column;

    img {
      width: 100%;
    }
    .options {
      justify-self: start;
      align-self: center;
    }
  }
}
.card {
  background-color: $background-component;
}
</style>
