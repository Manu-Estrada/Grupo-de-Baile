<script setup>
const props = defineProps({
  member: {
    type: Object,
    required: true,
  },
});
</script>
<template>
  <div :id="`card-size${member.id}`" class="card-container">
    <div class="card">
      <img
        class="imgCard"
        :src="`http://localhost:8080/images/user-photos/${member.imageUser.image}`"
        alt="Imagen"
      />
      <div class="card-body pt-1" id="hg-size">
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
        
          <figure>
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
            
          </figure>
        </div>
      </div>
    </div>
  </div>
</template>
<style lang="scss" scoped>
@import "../assets/sass/_variables.scss";
@import "../assets/sass/galleryStyles/gallerystyles.scss";

.card-container {
  width: 30%;
  .card {
    .imgCard {
      aspect-ratio: 16/9;
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
      max-width: none;
      padding: 15px;
      border-radius: 10px;
      .modal-content {
        justify-content: center;
        border: none;
        figure {
          // height: 85vh;
          object-fit: scale-down;
          width:fit-content;
          margin: auto;
          // display: flex;
          // justify-content: center;
          background-color: $background-card;
          padding: 2em;
          border-radius: 8px;

          

          img {
            object-fit: scale-down;
            width: 100%;
            max-height: 70vh;
            margin: auto;
          }
          button {
    // position: absolute;
    background-color: $background-green;
    
  }
        }
      }
    }
  }

  
}

@media (max-width: 768px) {
  .card-container  {
    width: 45%;
  }
}
@media (max-width: 576px) {
  .card-container  {
    width: 90%;
  }
}

</style>
