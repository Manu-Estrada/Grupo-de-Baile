<script setup>
import { RouterLink } from "vue-router";
</script>

<template>
  <nav class="navbar navbar-expand-lg">
    <div class="container">
      <a href="/" class="navbar-brand"><img src="../assets/images/xareu-d-ochobre-vainilla.png" alt="Xaréu d'Ochobre" class="logo"></a>
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
            <RouterLink class="nav-link" to="/">Inicio</RouterLink>
          </li>

          <li class="nav-item">
            <RouterLink to="/nuestroseventos" class="nav-link"
              >Nuestros eventos</RouterLink
            >
          </li>
          <li class="nav-item">
            <RouterLink to="/nuestrosviajes" class="nav-link"
              >Nuestros viajes</RouterLink
            >
          </li>
          <li class="nav-item">
            <RouterLink class="nav-link" to="/sobrenosotros"
              >Sobre nosotros</RouterLink
            >
          </li>
          <li class="nav-item">
            <RouterLink class="nav-link" to="/quienessomos"
              >Quiénes somos</RouterLink
            >
          </li>
          <li class="nav-item">
            <RouterLink class="nav-link" to="/contacto">Contacto</RouterLink>
          </li>
          <li class="nav-item">
            <RouterLink class="nav-link" to="/login">Login</RouterLink>
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
      min-width: 200px;
    }
  }
}
.navbar {
  background-color: #336644;
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
