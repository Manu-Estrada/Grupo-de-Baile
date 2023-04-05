<script setup>

</script>

<template>
  <main>
   <div class="card">
    <img src="../../assets/images/cardAlbum.jpg" alt="Imagen" id="imgCards" />
  <div class="card-body pt-1">
    <p class="card-text"><small class="text-muted">01-01-2023</small></p>
    <h5 class="card-title">Primer Viaje</h5>
    <!-- <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p> -->
    <div id="containerBtn">
      <a href="#" class="btn btn-primary" id="Btn-see">Ver más</a>
    </div>
  </div>
</div>
  </main>
</template>
<style lang="scss" scoped>
@import "../../assets/sass/_variables.scss";
@import "../../assets/sass/galleryStyles/gallerystyles.scss";
#imgCards{
  height:17.2em;
  width: 100%;
  object-fit: cover;
}
</style>
