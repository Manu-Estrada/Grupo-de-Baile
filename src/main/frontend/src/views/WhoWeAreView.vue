<script setup>
import WhoWeAre from "../components/WhoWeAre.vue";
</script>

<template>
  <main>
    <div class="mt-5">
      <div class="container" id="headerH3">
        <h3>Quiénes somos</h3>
      </div>
      <div id="containerAlbums">
        <WhoWeAre />
        <WhoWeAre />
        <WhoWeAre />
        <WhoWeAre />
        <WhoWeAre />
        <WhoWeAre />
        <WhoWeAre />

      </div>
    </div>
  </main>
</template>
<style scoped lang="scss" >
@import "../assets/sass/variables";
@import "../assets/sass/styles.scss";
@import "../assets/sass/galleryStyles/gallerystyles.scss"; 
#containerAlbums {
  display: flex;
  flex-wrap: wrap;
  justify-content: space-around;
}
#headerH3 {
  margin: 0px 50px 10px 53px;
}
h3 {
  font-weight: bold;
}
</style>
