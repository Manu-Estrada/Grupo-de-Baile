<script setup></script>

<template>
  <footer class="footer w-100">
    <div class="footer__container-log">
      <img
        src="../../assets/images/xareu-d-ochobre-vainilla.png"
        alt="logo Xaréu D´ Ochobre"
      />
    </div>
    <div class="footer__container-title">
      <p class="footer__container-title__slogan">
        “Danzar es avanzar en la vida, por lo tanto, seguir danzando para seguir
        avanzando”
      </p>
      <p class="footer__container-title__copyright">&copy; Xaréu D'Ochobre</p>
    </div>
    <div class="footer__container-navigation">
      <ul>
        <li>
          <RouterLink class="nav-link" to="/">Inicio</RouterLink>
        </li>

        <li>
          <RouterLink to="/nuestroseventos" class="nav-link"
            >Nuestros eventos</RouterLink
          >
        </li>
        <li>
          <RouterLink to="/nuestrosviajes" class="nav-link"
            >Nuestros viajes</RouterLink
          >
        </li>
        <li>
          <RouterLink class="nav-link" to="/sobrenosotros"
            >Sobre nosotros</RouterLink
          >
        </li>
        <li>
          <RouterLink class="nav-link" to="/quienessomos"
            >Quiénes somos</RouterLink
          >
        </li>
        <li>
          <RouterLink class="nav-link" to="/contacto">Contacto</RouterLink>
        </li>
        <li>
          <RouterLink class="nav-link" to="/login">Login</RouterLink>
        </li>
      </ul>
    </div>
    <div class="footer__container-social-media">
      <a
        href=" https://www.facebook.com/profile.php?id=100051181520137"
        target="_blank"
        ><img
          class="image-icon icons"
          src="../../assets/images/iconFacebook.png"
          alt="facebbok-icon"
      /></a>

      <a
        href="https://instagram.com/xareu_d_ochobre?igshid=YmMyMTA2M2Y="
        target="_blank"
        ><img
          class="image-icon icons"
          src="../../assets/images/icon-Instagram.png"
          alt="instagram-icon"
      /></a>
    </div>
  </footer>
</template>

<style lang="scss" scoped>
@import "../assets/sass/variables";

.footer {
  background-color: $background-green;
  display: flex;
  justify-content: space-around;
  flex-wrap: wrap;
  color: $background-component;
  align-items: end;
  padding: 2rem 0;

  &__container-log {
    img {
      width: 237px;
    }
  }

  &__container-title {
    display: flex;
    font-family: $font-text;
    flex-direction: column;
    justify-content: end;
    align-items: start;

    &__slogan {
      font-size: 1.25rem;
    }

    &__copyright {
      font-size: 2vh;
      color: $text-copyright;
    }

    &__container-title {
      display: flex;
      font-family: Libre Baskerville, serif;

      &__copyright {
        font-size: 2vh;
      }
    }
    &__container-navigation {
      background-color: $background-green;
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

    &__container-social-media {
      display: flex;
      flex-direction: row;
      justify-content: center;
      cursor: pointer;
      flex-wrap: nowrap;
    }
    .icons {
      margin: 1vh;
      opacity: 100%;
    }
    .icons a:hover {
      opacity: 50%;
    }
  }
}

@media (min-width: 1024px) {
  .footer {
    background-color: $background-green;
    display: flex;
    // justify-content:space-around;
    flex-wrap: wrap;
    color: $background-component;
    align-items: end;

    &__container-title {
      &__copyright {
        font-size: 1.25rem;
        margin-bottom: 0.3rem;
      }
    }

    &__container-navigation {
      background-color: $background-green;
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

    &__container-social-media {
      display: flex;
      flex-direction: row;
      justify-content: space-around;
      cursor: pointer;
      flex-wrap: nowrap;
      align-items: center;

      .icons {
        margin: 1vh;
      }
    }
  }
}
</style>
