<script setup>
const props = defineProps({
  member: {
    type: Object,
    required: true,
  },
});
</script>
<template>
  <div class="card">
    <img
      class="imgCard"
      :src="`http://localhost:8080/images/user-photos/${member.imageUser.image}`"
      alt="Imagen"
    />
    <div class="card-body pt-1">
      <p class="card-text">
        <small class="text-muted"> {{ member.dateadmission }}</small>
      </p>
      <h5 class="card-title">{{ member.name }} {{ member.lastname }}</h5>
      <div id="containerBtnMemebrs">
        <a
          data-bs-toggle="modal"
          :data-bs-target="`#exampleModal${member.imageUser.id}`"
          class="btn btn-primary"
          id="Btn-see"
          >Ampliar</a
        >
      </div>
    </div>
  </div>

  <div
    class="modal fade"
    :id="`exampleModal${member.imageUser.id}`"
    tabindex="-1"
    aria-labelledby="exampleModalLabel"
    aria-hidden="true"
  >
    <div class="modal-dialog" :id="`modalDialog${member.imageUser.id}`">
      <div
        class="modal-content bg-transparent"
        :id="`boxImg${member.imageUser.id}`"
      >
        <div class="d-flex justify-content-end">
          <button
            type="button"
            class="btn-close"
            data-bs-dismiss="modal"
            aria-label="Close"
            :id="`btnClosed${member.imageUser.id}`"
          ></button>
        </div>
        <img
          :src="`http://localhost:8080/images/user-photos/${member.imageUser.image}`"
          data-bs-toggle="modal"
          data-bs-target="#exampleModal"
          :alt="member.name"
        />
      </div>
    </div>
  </div>
</template>
<style lang="scss" scoped>
@import "../assets/sass/_variables.scss";
@import "../assets/sass/galleryStyles/gallerystyles.scss";

.card {
  .imgCard {
    height: 10em;
    width: 100%;
    object-fit: cover;
  }
  #containerBtnMemebrs {
    display: flex;
    justify-content: center;
  }
}
.modal {
  width: 100vw;
  .modal-dialog {
    max-width: 75%;
  }
}
</style>
