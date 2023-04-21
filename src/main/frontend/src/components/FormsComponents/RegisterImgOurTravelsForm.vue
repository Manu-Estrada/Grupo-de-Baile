<script setup>
import { computed } from "@vue/reactivity";
import { ourTravels } from "../.././stores/ourTravels";
import router from "../../router";

const ourTravelsToModify = ourTravels();

const ourTravelsData = computed(() => {
  return ourTravelsToModify.ourTravelsObject;
});

const props = defineProps({
  id: {
    type: String,
  },
});

async function uploadFile(id) {
  let formData = new FormData();
  let url = `http://localhost:8080/api/travels/${id}/imagestravel`;
  formData.append("image", image.files[0]);
  let response = await fetch(url, {
    method: "POST",
    body: formData,
  });

  if (response.status == 200) {
    alert("Imagen subida satisfactoriamente.");
    router.push("/listaviajes");
  }
}

async function deleteFile(id, idImage) {
  if (confirm("¿Está seguro de que quiere borrar esta imagen?") == true) {
    fetch(`http://localhost:8080/api/travels/${id}/imagestravel/${idImage}`, {
      method: "DELETE",
      headers: {
        "Content-Type": "application/json",
      },
    });
    alert("Imagen borrada satisfactoriamente");
    router.push("/listaviajes");
  }
}
</script>

<template>
  <div class="container">
    <div class="d-flex flex-wrap wrap w-100">
        <div
          class="w-25 d-flex flex-column align-center justify-content-center align-items-center"
          v-if="ourTravelsData.imageTravel.length > 0"
          v-for="image in ourTravelsData.imageTravel"
        >
          <img
            :src="`http://localhost:8080/images/travel-photos/${image.image}`"
            alt="..."
          />
          <button
            @click="deleteFile(id, image.id)"
            type="button"
            class="btn btn-success me-2 w-50 mt-3"
          >
            Eliminar imagen
          </button>
      </div>
    </div>
    <div class="row">
      <div class="col-12 mt-4 mb-4 d-flex">
        <div>
          <label for="imagen" class="form-label">Imagen</label>
          <input
            type="file"
            id="image"
            class="form-control"
            placeholder="añade foto"
          />
          <button
            @click="uploadFile(id)"
            type="button"
            class="btn btn-success me-2 w-50 mt-3"
          >
            Enviar
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<style lang="scss" scoped>
@import "../../assets/sass/variables";
@import "../../assets/sass/global.scss";

.container {
  min-height: 60vh;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 90%;
  margin: 40px auto;
}

.form-label {
  font-size: 1.25rem;
  font-weight: bold;
}

.form-control {
  border-radius: 10px;
}

img {
  width: 50%;
  max-height: 25vh;
  object-fit: cover;
  margin: auto;
  display: block;
}
button {
  display: block;
  margin-bottom: 30px;
}

@media (max-width: 1024px) {
  .w-25 {
    width: 33% !important;
  }
}

@media (max-width: 768px) {
  .w-25 {
    width: 50% !important;
  }
}

@media (max-width: 576px) {
  .w-25 {
    width: 100% !important;
  }
}

</style>
