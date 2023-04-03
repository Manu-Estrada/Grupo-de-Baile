<script setup>
import {RouterView } from 'vue-router'
import NavbarComponent from './components/NavbarComponent.vue';
import FooterComponent from './components/componentsVue/FooterComponent.vue';
</script>
<template>
  <NavbarComponent></NavbarComponent>
  <RouterView />
  <FooterComponent></FooterComponent>
</template>

