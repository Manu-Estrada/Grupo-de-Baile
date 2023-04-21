<script setup>
const props = defineProps({
  travel: {
    type: Object,
    required: true,
  },
});
</script>

<template>
  <main>
   <div :id="`card-size${travel.id}`" class="card-container">
   <div class="card">
    <figure v-if="travel.imageTravel.length > 0">
    <img :src="`http://localhost:8080/images/travel-photos/${travel.imageTravel[0].image}`" alt="Imagen" id="imgCards"/>
    </figure>
  <div class="card-body pt-1">
    <p class="card-text"><small class="text-muted">{{ travel.datetravel }}</small></p>
    <h5 class="card-title" >{{ travel.name }}</h5>
    <!-- <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p> -->
    <div id="containerBtn">
      <a href="#" class="btn btn-primary" id="Btn-see">Ver más</a>
    </div>
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
