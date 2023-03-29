<script setup>
import { RouterLink, RouterView } from 'vue-router'
import FooterComponent from './components/componentsVue/FooterComponent.vue';

</script>
<template>
  
  <!-- <RouterView /> -->
  <FooterComponent />
  
  <router-link to="/">home ||</router-link>
  <router-link to="/calendario">calendario || </router-link>
  <router-link to="/viajes">viajes || </router-link>
  <router-link to="/galeria">galeria || </router-link>
  <router-link to="/sobrenosotros">sobre nosotros || </router-link>
  <router-link to="/login">login || </router-link>
  <router-link to="/quienessomos">quienes somos || </router-link>
  <router-link to="/contacto">contacto|| </router-link>





  <RouterView />
</template>

