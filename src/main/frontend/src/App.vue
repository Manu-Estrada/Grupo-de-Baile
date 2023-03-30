<script setup>
import { RouterLink, RouterView } from 'vue-router'
import FooterComponent from './components/componentsVue/FooterComponent.vue';
import NavbarComponent from './components/NavbarComponent.vue';


</script>
<template>
  <NavbarComponent />
  <!-- <RouterView /> -->
  <FooterComponent />
  




  <AboutUs />
  <RouterView />
</template>

