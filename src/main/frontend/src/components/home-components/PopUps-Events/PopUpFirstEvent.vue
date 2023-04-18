<script setup>
const props = defineProps({
  event: {
    type: Object,
    required: true,
  },
});
</script>
<template>
  <p> {{ event.dateevent }}</p>
  <button
    type="button"
    data-bs-toggle="modal"
    :data-bs-target="`#exampleModal${event.id}`"
    class="popUp-button"
  >
    {{ event.name }}
  </button>
  <!-- Modal -->
  <div
    class="modal fade"
    :id="`exampleModal${event.id}`"
    tabindex="-1"
    aria-labelledby="exampleModalLabel"
    aria-hidden="true"
  >
    <div class="modal-dialog modal-xl" >
      <div class="modal-content">
        <button
          type="button"
          class="btn-close"
          data-bs-dismiss="modal"
          aria-label="Close"
        ></button>
        <div>
          <div class="event-container">
            <img :src="`http://localhost:8080/images/event-photos/${event.imageevent.image}`" alt="" />
            <div class="text-container">
              <span> {{ event.dateevent }}</span>
              <h3>{{ event.name }}</h3>
              <p>
                {{ event.description }}
              </p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<style lang="scss" scoped>
@import "../../../assets/sass/home/popUp-Upcoming-events.scss";
</style>
