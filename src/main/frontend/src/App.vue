<script setup>
import {RouterView } from 'vue-router';
import FooterComponent from './components/FooterComponent.vue';
import NavbarComponent from './components/NavbarComponent.vue';
import NavbarAdminComponent from './components/NavbarAdminComponent.vue';
</script>
<template>
  <NavbarComponent/>
  <!-- <NavbarAdminComponent /> -->
  <RouterView />
<FooterComponent/>
</template>

