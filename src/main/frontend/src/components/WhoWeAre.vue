<script setup>

</script>

<template>
  <main>
   <div class="card">
    
      <img  src="../assets/images/foto1.webp" alt="Imagen" style="max-width: fit-content;" />

    <div class="card-body pt-1">
      <p class="card-text"><small class="text-muted">01-01-2023</small></p>
      <h5 class="card-title">José García</h5>
      <!-- <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p> -->
      <div id="containerBtnMemebrs">
        <a href="#" class="btn btn-primary" id="Btn-see" >Ampliar</a>
      </div>
    </div>
   </div>
  </main>
</template>
<style lang="scss" scoped>
@import "../assets/sass/_variables.scss";
@import "../assets/sass/galleryStyles/gallerystyles.scss";

.card  {

  #containerBtnMemebrs{
      display: flex;
      justify-content: center;
      }
}

</style>
