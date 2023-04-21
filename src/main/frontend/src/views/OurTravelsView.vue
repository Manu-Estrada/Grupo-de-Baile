<script setup>
import CardAlbum from '../components/gallery/CardAlbum.vue';
import Pagination from "../components/gallery/Pagination.vue";
import { onBeforeMount, ref, computed } from "vue";
import ApiRepository from "./../assets/ApiRepository/ApiRepository.js";

// Api
const repository = new ApiRepository("nuestrosviajes");
const api = repository.chooseApi();

const travelCardxPage = 6;
const start = ref(0);
const end = computed(() => Math.min(start.value + travelCardxPage, travelsList.value.length));

let travelsList = ref([]);
onBeforeMount(async () => {
  travelsList.value = await api.getAll();
});

const travelsToShow = computed(() => {
  return travelsList.value.slice(start.value, end.value);
});

const next = () => {
  start.value += travelCardxPage;
};

const prev = () => {
  start.value = Math.max(start.value - travelCardxPage, 0);
};

const page = (algo) => {
  start.value = algo;
};

</script>
<template>
<main>
  <div class="mt-5">
  <div class="container" id="headerH3">
    <h3>Nuestros viajes</h3>
  </div>
<div id="containerAlbums">
 
<CardAlbum v-for="travel in travelsToShow" :key="travel.id" :travel="travel" />

</div>
</div> 
</main>
</template>
<style scoped lang="scss">
@import "../assets/sass/variables";
@import "../assets/sass/styles.scss";
@import "../assets/sass/galleryStyles/gallerystyles.scss"; 

#containerAlbums{
  display: flex;
  flex-wrap:wrap;
  justify-content: space-around;
  margin: 1.5em;
}
#headerH3 {
 width: 90%;
}
h3{
  margin-left: 7%;
  font-weight: bold;
}

</style>