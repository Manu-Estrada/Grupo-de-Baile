<script setup>
import CardGallery from "../components/gallery/CardGallery.vue";
import Pagination from "../components/gallery/Pagination.vue";
import { onBeforeMount, ref, computed } from "vue";
import ApiRepository from "./../assets/ApiRepository/ApiRepository.js";
import { ourTravels } from "../stores/ourTravels";
import { RouterLink } from "vue-router";


const travel = new ourTravels;

const thistravel = computed(() =>  {
  return travel.ourTravelsObject;
});

// Api
const repository = new ApiRepository("nuestrosviajes");
const api = repository.chooseApi();

const travelCardxPage = 6;
const start = ref(0);
const end = computed(() =>
  Math.min(start.value + travelCardxPage, travel.ourTravelsObject.imageTravel.length)
);

let travelsList = ref([]);
onBeforeMount(async () => {
  travelsList.value = await api.getAll();
});

const travelsToShow = computed(() => {
  return thistravel.imageTravel;
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

function formatDate(date) {
  return date.split(/[-/]/).reverse().join('-');
}

</script>
<template>
  <main>
    <div class="mt-5">
      <div class="container" id="headerH3">
        <h3><RouterLink to="/nuestrosviajes">Volver a Nuestros viajes</RouterLink> &lt; {{thistravel.name}}</h3>
      </div>
      <p><em>{{ formatDate(thistravel.datetravel) }}</em><br />
        {{ thistravel.description }}
      </p>
      <div id="containerAlbums">
        <CardGallery
          v-for="image in thistravel.imageTravel"
          :id="image.id"
          :image="image.image"

        />
      </div>
      <Pagination
        :pageSize="travelCardxPage"
        :start="start"
        :end="end"
        :maxLength="travelsList.length"
        @change="page"
        @prev="prev"
        @next="next"
      />
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

  p  {
    width: 86%;
    margin: 0 auto 40px auto;
    padding: 2vw;
    background-color: white;
  }
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
#color-pag {
  color: black;
}

a {
  text-decoration: none;
  color: $background-green;
  transition: all 0.4s;
  &:hover {
    letter-spacing: 1px;
  }
}
</style>
