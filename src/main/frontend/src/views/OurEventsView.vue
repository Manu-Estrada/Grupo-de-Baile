<script setup>
import OurEventsComponent from "../components/OurEventsComponent.vue";
</script>
<template>
  <section class="our-events-view">
    <h3>Nuestros Eventos</h3>
    <div class="our-events-container">
      <OurEventsComponent />
      <OurEventsComponent />
      <OurEventsComponent />
    </div>
  </section>
</template>
<style lang="scss" scoped>
@import "../assets/sass/variables";
.our-events-view {
  display: flex;
  flex-direction: column;
  align-items: center;

  h3 {
    width: 90%;
    margin: 20px;
  }
  .our-events-container {
    display: flex;
    flex-direction: column;
    align-items: center;
  }
}
</style>
