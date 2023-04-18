<script setup>
import OurEventsComponent from "../components/our-events/OurEventsComponent.vue";
import { onBeforeMount, ref, computed } from "vue";
import ApiRepository from "./../assets/ApiRepository/ApiRepository.js";
import Pagination from "../components/gallery/Pagination.vue";
// Api
const repository = new ApiRepository("eventos");
const api = repository.chooseApi();

const eventCardxPage = 6;
const start = ref(0);
const end = computed(() =>
  Math.min(start.value + eventCardxPage, eventsList.value.length)
);

let eventsList = ref([]);
onBeforeMount(async () => {
  eventsList.value = await api.getAll();
});

const eventsToShow = computed(() => {
  return eventsList.value.slice(start.value, end.value);
});

const next = () => {
  start.value += eventCardxPage;
};

const prev = () => {
  start.value = Math.max(start.value - eventCardxPage, 0);
};

const page = (algo) => {
  start.value = algo;
};
</script>
<template>
  <section class="our-events-view">
    <h3>Nuestros Eventos</h3>
    <div class="our-events-container">
      <OurEventsComponent
        v-for="event in eventsToShow"
        :key="event.id"
        :event="event"
      />
    </div>
    <Pagination
      :pageSize="eventCardxPage"
      :start="start"
      :end="end"
      :maxLength="eventsList.length"
      @change="page"
      @prev="prev"
      @next="next"
    />
  </section>
</template>
<style lang="scss" scoped>
@import "../assets/sass/our-events/our-events-view.scss";

</style>
