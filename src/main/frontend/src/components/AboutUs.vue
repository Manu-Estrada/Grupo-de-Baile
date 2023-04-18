<script setup>
import { onBeforeMount, ref, computed } from "vue";
import { aboutUs } from "../stores/aboutUs";
import { imageAboutUs } from "../stores/imageAboutUs";
import AboutUsCard from './FormsComponents/AboutUsCard.vue';
import ApiRepository from "../assets/ApiRepository/ApiRepository.js";
import Pagination from "../components/gallery/Pagination.vue";

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


</script>

<template>
  <main class="pruebas">
    <h2>Sobre nosotros</h2>
    <p class="slogan">
      “Danzar es avanzar en la vida, por lo tanto, seguir danzando para seguir
      avanzando”
    </p>
    <AboutUsCard v-for="aboutUs in aboutUsToShow" :key="aboutUs.id" :item="aboutUs"></AboutUsCard>
    <Pagination :pageSize="aboutUsCardxPage" :start="start" :end="end" :maxLength="aboutUsList.length" @change="page"
      @prev="prev" @next="next" class="mt-5" />
  </main>
</template>

<style lang="scss" scoped>
main {
  padding: 3em;

  h2 {
    color: #cc0033;
  }

  .slogan {
    background: #ffffff;
    text-align: center;
    padding: 3rem;
    font-size: 2rem;
    font-style: oblique;
  }
}

@media (max-width: 768px) {
  main {
    padding: 1rem;
  }

  .slogan {
    font-size: 1rem;
  }
}
</style>