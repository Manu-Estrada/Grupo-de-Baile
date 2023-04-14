<script setup>
import PopUpFirstEvent from "./PopUps-Events/PopUpFirstEvent.vue";
import PopUpSecondEvent from "./PopUps-Events/PopUpSecondEvent.vue";
import PopUpThirdEvent from "./PopUps-Events/PopUpThirdEvent.vue";
</script>
<template>
  <aside>
    <div class="event-container">
      <h2><RouterLink to="/nuestroseventos">Próximos eventos</RouterLink></h2>
      <span>01-01-2023</span>
      <PopUpFirstEvent />
      <span>01-01-2023</span>
      <PopUpSecondEvent/>
      <span>01-01-2023</span>
      <PopUpThirdEvent/>
    </div>
  </aside>
</template>
<style lang="scss" scoped>
@import "../../assets/sass/home/Upcoming-events.scss";
</style>
