<script setup>
import WhoWeAre from "../components/WhoWeAre.vue";
import Pagination from "../components/gallery/Pagination.vue";
import { onBeforeMount, ref, computed } from "vue";
import ApiRepository from "./../assets/ApiRepository/ApiRepository.js";

// Api
const repository = new ApiRepository("quienesSomos");
const api = repository.chooseApi();

const memberCardxPage = 6;
const start = ref(0);
const end = computed(() => Math.min(start.value + memberCardxPage, membersList.value.length));

let membersList = ref([]);
onBeforeMount(async () => {
  membersList.value = await api.getAll();
});

const membersToShow = computed(() => {
  return membersList.value.slice(start.value, end.value);
});

const next = () => {
  start.value += memberCardxPage;
};

const prev = () => {
  start.value = Math.max(start.value - memberCardxPage, 0);
};

const page = (algo) => {
  start.value = algo;
};

</script>
<template>
  <main>
    <div class="mt-5">
      <div class="container" id="headerH3">
        <h3>Quiénes somos</h3>
      </div>
      <div id="containerAlbums">
        <WhoWeAre v-for="member in membersToShow" :key="member.id" :member="member" />
      </div>
      <Pagination :pageSize="memberCardxPage" :start="start" :end="end" :maxLength="membersList.length" @change="page" @prev="prev" @next="next" />
    </div>
  </main>
</template>

<style scoped lang="scss">
@import "../assets/sass/variables";
@import "../assets/sass/styles.scss";
@import "../assets/sass/galleryStyles/gallerystyles.scss";
.mt-5 {
  display: flex;
  justify-content: center;
  flex-direction: column;
  align-items: center;
}
#containerAlbums {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-around;
  width: 90%;
}
#headerH3 {
  width: 90%;
}
h3 {
  font-weight: bold;
  margin: 0.5em;
}
#color-pag  {
  color: black;
}
</style>