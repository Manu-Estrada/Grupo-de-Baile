<script setup>
import OurEventsPopUp from "./OurEventsPopUp.vue";
</script>
<template>
  <div class="card-container">
    <img src="../../assets/images/IMG_20190928_181206.jpg" alt="" />
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
