<script setup>
import SliderComponent from "../components/home-components/SliderComponent.vue";
import UpcommingEvents from "../components/home-components/UpcommingEvents.vue";
import Welcome from "../components/home-components/Welcome.vue";
</script>

<template>
  <SliderComponent />
  <div class="hero-container">
    <UpcommingEvents />
    <Welcome />
  </div>
</template>
<style lang="scss" scoped>
@import "../assets/sass/home/hero-container.scss";
</style>
