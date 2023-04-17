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
  <div :id="`card-size${event.id}`" class="card-container">
    <figure v-if="event.imageevent">
      <img
        :src="`http://localhost:8080/images/event-photos/${event.imageevent.image}`"
        alt="Imagen Evento"
      />
    </figure>
    <div class="text-container">
      <span> {{ event.dateevent }}</span>
      <h4>{{ event.name }}</h4>
      <p>
        {{ event.description }}
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
