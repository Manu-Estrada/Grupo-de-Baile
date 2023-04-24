<script setup>
import { ref, onMounted, onUnmounted } from "vue";

const isScrolled = ref(false);

const scrollToTop = () => {
  window.scrollTo({
    top: 0,
    behavior: "smooth",
  });
};

const onScroll = () => {
  isScrolled.value = window.scrollY > 0;
};

onMounted(() => {
  window.addEventListener("scroll", onScroll);
});

onUnmounted(() => {
  window.removeEventListener("scroll", onScroll);
});
</script>
<template>
  <div class="sections d-flex flex-column">
    <section class="welcome-container">
      <img src="../../assets/images/COVADONGA.jpg" alt="group-image" />
      <div>
        <h2>¡Bienvenidos a Xaréu D’Ochobre!</h2>
        <p>
          Nacida en Avilés, Asturias, el 28 de octubre de 1988, la Agrupación
          Cultural Xaréu d´ Ochobre se dedica a la conservación y divulgación de
          la música y danza tradicional asturiana.
        </p>
        <div>
          <button
            class="ir-arriba"
            @click="scrollToTop"
            :class="{ 'ir-arriba--visible': isScrolled }"
          >
            <RouterLink class="nav-link" to="/sobrenosotros"
              >Sobre nosotros</RouterLink
            >
          </button>
        </div>
      </div>
    </section>
    <section class="associations">
      <h2>Asociaciones a las que pertenecemos</h2>
      <p>
        Xaréu d'Ochobre forma parte de las siguientes asociaciones folcóricas:
      </p>
      <figure>
        <img
          src="../../assets/images/federacion-de-agrupaciones-de-folklore-asturiano.jpg"
          alt=""
        />
        <figcaption>
          Federación de agrupaciones de folklore asturiano
        </figcaption>
      </figure>
      <figure>
        <img
          src="../../assets/images/federacion-espanola-de-agrupaciones-de-folclore.jpg"
          alt=""
        />
        <figcaption>Federación española de agrupaciones de folclore</figcaption>
      </figure>
    </section>
  </div>
</template>
<style lang="scss" scoped>
@import "../../assets/sass/home/welcome.scss";

.ir-arriba {
  z-index: 999;
  display: none;
}

.ir-arriba--visible {
  display: block;
}

.sections {
  width: 64%;
  .associations {
    margin-top: 20px;
    background-color: white;
    padding: 15px;
    p {
      margin-left: 1rem;
    }
    figure {
      display: flex;
      align-items: end;
      img {
        height: 150px;
      }
    }
    figure:last-child {
      margin-top: 30px;
    }
  }
}

@media (max-width: 1200px) {
  .sections {
    .associations {
      figure {
        flex-direction: column;
        align-items: start;
      }
    }
  }
}

@media (max-width: 768px) {
  .sections {
    .associations {
      figure:last-child {
        img {
          width: 100%;
          height: auto;
        }
      }
    }
  }
}
</style>
