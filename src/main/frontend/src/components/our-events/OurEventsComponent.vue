<script setup>
import OurEventsPopUp from "./OurEventsPopUp.vue";
const props = defineProps({
  event: {
    type: Object,
    required: true,
  },
});



</script>
<template>
  <div :id="`${event}`" class="card-container">
    <img 
    :src="`http://localhost:8080/images/event-photos/${event.imageEvent.event}`"
 alt="Imagen Evento" />
    <div class="text-container">
      <span>01-01-2023</span>
      <h4>Evento Primero</h4>
      <p>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet
        facilisis dapibus. Donec aliquet ligula ipsum, tincidunt viverra risus
        malesuada ac. Curabitur fringilla sapien sit amet ex mollis finibus.
        Praesent molestie lectus sit amet tortor condimentum consectetur. Orci
        varius natoque penatibus et magnis dis parturient montes, nascetur
        ridiculus mus.
      </p>
      <div>
        <OurEventsPopUp />
      </div>
    </div>
  </div>
</template>
<style lang="scss" scoped>
@import "../../assets/sass/our-events/our-events-component.scss";
</style>
