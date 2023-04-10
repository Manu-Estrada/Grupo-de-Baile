<script setup>
import { ref, onMounted, onUnmounted } from 'vue';

const isScrolled = ref(false);

const scrollToTop = () => {
  window.scrollTo({
    top: 0,
    behavior: 'smooth'
  });
};

const onScroll = () => {
  isScrolled.value = window.scrollY > 0;
};

onMounted(() => {
  window.addEventListener('scroll', onScroll);
});

onUnmounted(() => {
  window.removeEventListener('scroll', onScroll);
});

</script>
<template>
  <section class="welcome-container">
    <img src="../../assets/images/COVADONGA.jpg" alt="group-image" />
    <div>
      <h2>¡Bienvenidos a Xaréu D’Ochobre!</h2>
      <p>
        Nacida en Avilés, Asturias, el 28 de octubre de 1988, la Agrupación
        Cultural Xaréu d´ Ochobre se dedica a la conservación y divulgación 
        de la música y danza tradicional asturiana. 
      </p>
      <div>
        <button class="ir-arriba" @click="scrollToTop" :class="{ 'ir-arriba--visible': isScrolled }"><RouterLink class="nav-link" to="/sobrenosotros">Sobre nosotros</RouterLink></button>
      </div>
    </div>
  </section>
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
</style>
