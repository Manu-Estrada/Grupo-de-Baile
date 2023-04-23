<script setup>
import Pagination from "../components/gallery/Pagination.vue";
import { onBeforeMount, ref, computed } from "vue";
import ApiRepository from "../assets/ApiRepository/ApiRepository.js";
import { ourEvents } from "../stores/ourEvents";
import { imageOurEvents } from "../stores/imageOurEvents";
import router from "../router/index";

const ourEventsItem = ourEvents();
const imageOurEventsItem = imageOurEvents();

function update(id, ourEvents, imageOurEvents) {
  ourEventsItem.ourEventsObject = ourEvents;
  imageOurEventsItem.ourEventsImageObject = imageOurEvents;
  router.push("/modificarnuestroseventos" + "/" + id);
}

function updateImage(id, ourEvents, imageOurEvents) {
  ourEventsItem.ourEventsObject = ourEvents;
  imageOurEventsItem.ourEventsImageObject = imageOurEvents;
  router.push("/registrofotonuestroseventos" + "/" + id);
}

const repository = new ApiRepository("eventos");
const api = repository.chooseApi();

const eventsCardxPage = 2;
const start = ref(0);
const end = computed(() =>
  Math.min(start.value + eventsCardxPage, ourEventsList.value.length)
);

let ourEventsList = ref([]);
onBeforeMount(async () => {
  ourEventsList.value = await api.getAll();
});

const ourEventsToShow = computed(() => {
  return ourEventsList.value.slice(start.value, end.value);
});

const next = () => {
  start.value += eventsCardxPage;
};

const prev = () => {
  start.value = Math.max(start.value - eventsCardxPage, 0);
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
  const response = fetch(`http://localhost:8080/api/events/${id}`, {
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
      v-for="ourEvents in ourEventsToShow"
      :key="ourEvents.id"
      :member="ourEvents"
    >
      <div class="row g-0">
        <div v-if="ourEvents.imageevent">
          <img
            :src="`http://localhost:8080/images/event-photos/${ourEvents.imageevent.image}`"
            class="img-fluid"
            alt="..."
          />
        </div>
        <div v-else>
          <img
            src="http://localhost:8080/images/xareu-d-ochobre-logo.jpg"
            class="img-fluid"
            alt="..."
          />
        </div>
        <div class="text">
          <div class="text-name">
            <p class="font-date">
              <b>{{ ourEvents.dateevent }}</b>
            </p>
            <p class="font-name">
              <b>{{ ourEvents.name }}</b>
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
                  @click="deletePost(ourEvents.id)"
                >
                  Borrar
                </button>
                <button
                  type="button"
                  class="btn btn-warning"
                  @click="
                    update(ourEvents.id, ourEvents, ourEvents.imageTravel)
                  "
                >
                  Modificar
                </button>
                <button
                  type="button"
                  class="btn btn-success"
                  @click="
                    updateImage(ourEvents.id, ourEvents, ourEvents.imageTravel)
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
      :pageSize="eventsCardxPage"
      :start="start"
      :end="end"
      :maxLength="ourEventsList.length"
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
