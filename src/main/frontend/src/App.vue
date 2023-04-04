<script setup>
import {RouterView } from 'vue-router';
import FooterComponent from './components/FooterComponent.vue';
import NavbarComponent from './components/NavbarComponent.vue';
</script>
<template>
  <NavbarComponent/>
  <RouterView />
<FooterComponent/>
</template>

