<script setup>
import OurEventsPopUp from "./OurEventsPopUp.vue";
const props = defineProps({
  event: {
    type: Object,
    required: true,
  },
});

function formatDate(date) {
  return date.split(/[-/]/).reverse().join('-');
}
</script>
<template>
  <div :id="`card-size${event.id}`" class="card-container">
    <figure v-if="event.imageevent">
      <img
        class="imgCardEvent"
        :src="`http://localhost:8080/images/event-photos/${event.imageevent.image}`"
        alt="Imagen Evento"
      />
    </figure>
    <figure v-else>
      <img
        class="imgCard"
        src="http://localhost:8080/images/xareu-d-ochobre-logo.jpg"
        alt="Imagen"
      />
    </figure>
    <div class="text-container">
      <h4>{{event.name  }}</h4>
      <span> {{ formatDate(event.dateevent) }}</span>

      <p>
        {{ event.description }}
      </p>

      <div class="event-popup">
        <OurEventsPopUp :eventThis="event" />
      </div>
    </div>
  </div>
</template>
<style lang="scss" scoped>
@import "../../assets/sass/our-events/our-events-component.scss";
</style>
