<script setup>
import WhoWeAre from "../components/WhoWeAre.vue";
import { onBeforeMount, ref } from 'vue';
import ApiRepository from  './../assets/ApiRepository/ApiRepository.js'
import { computed } from "@vue/reactivity";

const repository = new ApiRepository("quienesSomos");
const api = repository.chooseApi();

let membersList = ref([]);
onBeforeMount(async () => {
  membersList.value = await api.getAll();
})
const showThisMember = computed(() => {
    return membersList;
  });
</script>

<template>
  <main>
    <div class="mt-5">
      <div class="container" id="headerH3">
        <h3>Quiénes somos</h3>
      </div>
      <div id="containerAlbums">
        <WhoWeAre v-for="member in showThisMember.value" :member="member"/>
     
      </div>
    </div>
  </main>
</template>
<style scoped lang="scss" >
@import "../assets/sass/variables";
@import "../assets/sass/styles.scss";
@import "../assets/sass/galleryStyles/gallerystyles.scss"; 
.mt-5  {
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
  // margin: 0px 50px 10px 53px;
}
h3 {
  font-weight: bold;
  margin: 0.5em;
}
</style>
