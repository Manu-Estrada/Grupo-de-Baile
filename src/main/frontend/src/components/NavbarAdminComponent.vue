<script setup>
import { RouterLink } from "vue-router";
</script>

<template>
  <nav class="navbar navbar-expand-lg">
    <div class="container">
      <i class="bi bi-wechat"></i>
      <button
        class="navbar-toggler"
        type="button"
        data-bs-toggle="collapse"
        data-bs-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <RouterLink class="nav-link" to="/listausuario">Listado de Usuarios</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink class="nav-link" to="/registrousuario">Alta de Usuarios</RouterLink>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>
<style lang="scss" scoped>
@import "../assets/sass/variables";
nav {
  .container {
    img.logo {
      width: 13vw;
    }
  }
}
.navbar {
  background-color: $background-red;
  a {
    color: $background-card;
    transition: all 0.4s;
  }
  a.router-link-exact-active,
  a:hover {
    color: $background-upcomingEvents;
    letter-spacing: 1px;
  }
}
</style>
