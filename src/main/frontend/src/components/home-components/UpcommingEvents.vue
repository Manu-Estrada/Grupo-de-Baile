<script setup>
import ApiRepository from "../../assets/ApiRepository/ApiRepository";
import PopUpFirstEvent from "./PopUps-Events/PopUpFirstEvent.vue";
import { onBeforeMount, ref, computed } from "vue";

const repository = new ApiRepository("eventos");
const api = repository.chooseApi();

let eventsList = ref([]);
onBeforeMount(async () => {
  eventsList.value = await api.getAll();
});

const filterDates = computed(() => {
  let eventFuture = ref([]);
  eventFuture.value = eventsList.value.filter(
    (eventsList) => eventsList.dateevent >= actualdte
  );
  return eventFuture;
});

let fecha = new Date();
let year = fecha.getFullYear();
let month = ("0" + (fecha.getMonth() + 1)).slice(-2);
let day = ("0" + fecha.getDate()).slice(-2);
let actualdte = year + "-" + month + "-" + day;

</script>
<template>
  <aside>
    <div class="event-container">
      <h2><RouterLink to="/nuestroseventos">Próximos eventos</RouterLink></h2>
      <PopUpFirstEvent
        v-for="event in filterDates.value"
        :key="event.id"
        :event="event"
      />
    </div>
  </aside>
</template>
<style lang="scss" scoped>
@import "../../assets/sass/home/Upcoming-events.scss";
</style>
