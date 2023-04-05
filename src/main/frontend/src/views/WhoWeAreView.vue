<script setup>
import WhoWeAre from "../components/WhoWeAre.vue";
import { onBeforeMount, ref } from "vue";
import ApiRepository from "./../assets/ApiRepository/ApiRepository.js";
import { computed } from "@vue/reactivity";
//Paginacion
import BlogPost from "./components/BlogPost.vue"
import PaginatePost from "./components/PaginatePost.vue"
import LoadingSpinner from "./components/LoadingSpinner.vue"

const posts = ref([])
const postXPagina = 10
const inicio = ref(0)
const fin = ref(postXPagina)
const loading = ref(true)
 
const favorito = ref('')

const cambiarFavorito = (title) => {
  favorito.value = title
};
const next = () => {
  inicio.value = inicio.value + postXPagina
  fin.value = fin.value + postXPagina
}
const prev = () => {
  inicio.value = inicio.value - postXPagina
  fin.value = fin.value - postXPagina
}

fetch('https://jsonplaceholder.typicode.com/posts')
.then(respuesta => respuesta.json())
.then(data => posts.value = data )
.finally(() => loading.value = false)


//Api
const repository = new ApiRepository("quienesSomos");
const api = repository.chooseApi();

let membersList = ref([]);
onBeforeMount(async () => {
  membersList.value = await api.getAll();
});
const showThisMember = computed(() => {
  return membersList;
});

// Xavi
defineProps(['inicio','fin','maxLength'])
const emit = defineEmits(['next','prev']) 

</script>

<template>
  <main>
    <div class="mt-5">
      <div class="container" id="headerH3">
        <h3>Quiénes somos</h3>
      </div>
      <div id="containerAlbums">
        <WhoWeAre v-for="member in showThisMember.value" :member="member" />
      </div>
    </div>
  </main>

  <nav aria-label="Page navigation example">
  <ul class="pagination pagination-lg" style="justify-content: center; margin:20px 0;">
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item"><a class="page-link" href="#">4</a></li>

    <li class="page-item">
      <a class="page-link" href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>

<!-- <div class="btn-group" role="group" aria-label="Basic example">
    <button
      @click="emit('prev')"
      type="button"
      class="btn btn-primary"
      :disabled='inicio <= 0'>
      Anterior {{inicio}}
    </button>

    <button @click="emit('next')" class="btn btn-primary" :disabled="fin >= 100">Siguiente {{fin}}</button>
  </div> -->
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
