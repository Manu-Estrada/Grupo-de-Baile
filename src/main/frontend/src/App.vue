<script setup>
import { RouterView } from "vue-router";
import FooterComponent from "./components/FooterComponent.vue";
import NavbarComponent from "./components/NavbarComponent.vue";
import NavbarAdminComponent from "./components/NavbarAdminComponent.vue";
import { useAuthStore } from "../src/stores/auth-storage"

const isAuthenticated = useAuthStore()

</script>
<template>
  <NavbarComponent/>
  <NavbarAdminComponent v-if="isAuthenticated.roles=='ROLE_ADMIN'" />
  <RouterView />
  <FooterComponent />
</template>
