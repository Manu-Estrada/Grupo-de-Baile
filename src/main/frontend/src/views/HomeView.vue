<script setup>
import CardAlbum from '../components/gallery/CardAlbum.vue';
import Pagination from '../components/gallery/Pagination.vue'
import NavbarComponent from '../components/NavbarComponent.vue';

</script>

<template>
  <header class="container">
  <NavbarComponent/>
</header>
  <main class="container">
    
   <h1>Nuestros viajes</h1>
   <div id="container-albums">
   <CardAlbum/>
   <CardAlbum/>
   <CardAlbum/>
   <CardAlbum/>
   <CardAlbum/>
   <CardAlbum/>
   <Pagination/>
  </div>
  </main>
</template>
<style scoped>
#container-albums{
  display: flex;
  flex-wrap: wrap;
  justify-content: space-around;
}
</style>
