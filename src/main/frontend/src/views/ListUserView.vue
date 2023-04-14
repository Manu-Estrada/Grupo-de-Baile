<script setup>
import Pagination from "../components/gallery/Pagination.vue";
import { onBeforeMount, ref, computed } from "vue";
import ApiRepository from "./../assets/ApiRepository/ApiRepository.js";
import router from "../router";

// Api
const repository = new ApiRepository("quienesSomos");
const api = repository.chooseApi();

const memberCardxPage = 3;
const start = ref(0);
const end = computed(() =>
  Math.min(start.value + memberCardxPage, membersList.value.length)
);

let membersList = ref([]);
onBeforeMount(async () => {
  membersList.value = await api.getAll();
});

const membersToShow = computed(() => {
  return membersList.value.slice(start.value, end.value);
});

const next = () => {
  start.value += memberCardxPage;
};

const prev = () => {
  start.value = Math.max(start.value - memberCardxPage, 0);
};

const page = (algo) => {
  start.value = algo;
};

function deletePost(id) {
  fetch(`http://localhost:8080/api/users/${id}`, {
    method: "DELETE",
    headers: {
      "Content-Type": "application/json",
    },
  });
  alert("Delete successful");
  location.reload();
}
</script>
<template>
  <main>
    <div
      class="card mb-3"
      v-for="member in membersToShow"
      :key="member.id"
      :member="member"
    >
      <div class="row g-0">
        <div class="col-md-1">
          <img
            :src="`http://localhost:8080/images/user-photos/${member.imageUser.image}`"
            class="img-fluid rounded-start"
            alt="..."
          />
        </div>

        <div class="p-3 gap-3 d-flex col-md-11">
          <p class="font-italic">{{ member.dateadmission }}</p>
          <p>{{ member.lastname }}, {{ member.name }}</p>

          <div class="card-body">
            <p class="d-flex row">
              <button
                type="button"
                class="btn btn-danger"
                @click="deletePost(member.id)"
              >
                Borrar
              </button>
              <button type="button" class="btn btn-warning">Modificar</button>
              <button type="button" class="btn btn-success">Imagen</button>
            </p>
          </div>
        </div>
      </div>
    </div>

    <Pagination
      :pageSize="memberCardxPage"
      :start="start"
      :end="end"
      :maxLength="membersList.length"
      @change="page"
      @prev="prev"
      @next="next"
    />
  </main>
</template>

<style scoped lang="scss">
@import "../assets/sass/variables";
@import "../assets/sass/styles.scss";
@import "../assets/sass/galleryStyles/gallerystyles.scss";

img {
  aspect-ratio: 16/9;
  object-fit: cover;
}
.btn {
  margin: 0.3em;
  width: 5.4em;
}

</style>
