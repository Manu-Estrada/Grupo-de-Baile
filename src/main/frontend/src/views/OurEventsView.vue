<script setup>
import OurEventsComponent from "../components/our-events/OurEventsComponent.vue";
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
@import "../assets/sass/our-events/our-events-view.scss";
</style>
