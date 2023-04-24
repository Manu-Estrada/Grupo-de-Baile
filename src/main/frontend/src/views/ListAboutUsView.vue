<script setup>
import Pagination from "../components/gallery/Pagination.vue";
import { onBeforeMount, ref, computed } from "vue";
import ApiRepository from "../assets/ApiRepository/ApiRepository.js";
import { aboutUs } from "../stores/aboutUs";
import { imageAboutUs } from "../stores/imageAboutUs";
import router from "../router/index";

const aboutUsItem = aboutUs();
const imageAboutUsItem = imageAboutUs();

function update(id, aboutUs, imageAboutUs) {
  aboutUsItem.aboutUsObject = aboutUs;
  imageAboutUsItem.AboutUsImageObject = imageAboutUs;
  router.push("/modificarsobrenosotros" + "/" + id);
}

function updateImage(imageAboutUs, aboutUs, id) {
  aboutUsItem.aboutUsObject = aboutUs;
  imageAboutUsItem.AboutUsImageObject = imageAboutUs;
  router.push("/registrofotosobrenosotros" + "/" + id);
}

const repository = new ApiRepository("sobreNosotros");
const api = repository.chooseApi();

const aboutUsCardxPage = 2;
const start = ref(0);
const end = computed(() =>
  Math.min(start.value + aboutUsCardxPage, aboutUsList.value.length)
);

let aboutUsList = ref([]);
onBeforeMount(async () => {
  aboutUsList.value = await api.getAll();
});

const aboutUsToShow = computed(() => {
  return aboutUsList.value.slice(start.value, end.value);
});

const next = () => {
  start.value += aboutUsCardxPage;
};

const prev = () => {
  start.value = Math.max(start.value - aboutUsCardxPage, 0);
};

const page = (algo) => {
  start.value = algo;
};

async function deletePost(id) {
  if (confirm("¿Está seguro de que quiere borrar esta sección?") == true) {
    deleteThis(id);
  }
}

async function deleteThis(id) {
  const response = fetch(`http://localhost:8080/api/aboutus/${id}`, {
    method: "DELETE",
    headers: {
      "Content-Type": "application/json",
    },
  }).then((response) => {
    if (response.status == 200) {
      alert("Sección borrada correctamente.");
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
      v-for="aboutUs in aboutUsToShow"
      :key="aboutUs.id"
      :member="aboutUs"
    >
      <div class="row g-0">
        <div v-if="aboutUs.imageAboutUs">
          <img
            :src="`http://localhost:8080/images/aboutus-photos/${aboutUs.imageAboutUs.image}`"
            class="img-fluid"
            alt="..."
          />
        </div>
        <div class="text">
          <div class="text-name">
            <p class="font-name">
              <b>{{ aboutUs.name }}</b>
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
                  @click="deletePost(aboutUs.id)"
                >
                  Borrar
                </button>
                <button
                  type="button"
                  class="btn btn-warning"
                  @click="update(aboutUs.id, aboutUs, aboutUs.imageAboutUs)"
                >
                  Modificar
                </button>
                <button
                  type="button"
                  class="btn btn-success"
                  @click="
                    updateImage(aboutUs.id, aboutUs, aboutUs.imageAboutUs)
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
      :pageSize="aboutUsCardxPage"
      :start="start"
      :end="end"
      :maxLength="aboutUsList.length"
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
