<script setup>
import CardAlbum from '../components/gallery/CardAlbum.vue';

</script>
<template>
<main>
  <div class="mt-5">
  <div class="container" id="headerH3">
    <h3>Nuestros viajes</h3>
  </div>
<div id="containerAlbums">
 
<CardAlbum/>
<CardAlbum/>
<CardAlbum/>
<CardAlbum/>
<CardAlbum/>
<CardAlbum/>
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