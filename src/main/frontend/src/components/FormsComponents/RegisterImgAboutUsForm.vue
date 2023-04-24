<script setup>
import { computed } from "@vue/reactivity";
import { aboutUs } from "../../stores/aboutUs";
import router from "../../router";

const aboutUsToModify = aboutUs();

const aboutUsData = computed(() => {
  return aboutUsToModify.aboutUsObject;
});

const props = defineProps({
  id: {
    type: String,
  }
})

async function uploadFile(id) {
  let formData = new FormData();
  let url = `http://localhost:8080/api/aboutus/${id}/imagesaboutus`;
  formData.append("image", image.files[0]);
  let response = await fetch(url, {
    method: "POST", 
    body: formData
  });

  if (response.status == 200) {
    alert("Imagen subida satisfactoriamente.");
    router.push('/listasobrenosotros');
  }
  if (response.status == 406) {
    alert("Ya existe una imagen con ese nombre.\nNo puede haber dos que se llamen igual.");
  }
  if (response.status != 200 && response.status != 406) {
    alert("Se ha producido un error.\nPor favor, inténtelo más trade.");
  }

}

async function deleteFile(id) {
  if (confirm("¿Está seguro de que quiere borrar esta imagen?") == true) {
    fetch(`http://localhost:8080/api/aboutus/${id}/imagesaboutus`, {
      method: "DELETE",
      headers: {
        "Content-Type": "application/json",
      },
    });
    alert("Imagen borrada satisfactoriamente");
    router.push('/listasobrenosotros');
  }
}
</script>

<template>
  <div class="container">
    <div class="row">
      <div class="col-12 mt-4 mb-4">
        <div v-if="aboutUsData.imageAboutUs">
        <img :src="`http://localhost:8080/images/aboutus-photos/${aboutUsData.imageAboutUs.image}`" alt="..." />
        <button
          @click="deleteFile(id)"
          type="button"
          class="btn btn-success me-2 w-50 mt-3"
        >
          Eliminar imagen
        </button>
      </div>
        <label for="imagen" class="form-label">Imagen</label>
        <input type="file" id="image" class="form-control" placeholder="añade foto">
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
</template>

<style lang="scss" scoped>
@import "../../assets/sass/variables";
@import "../../assets/sass/global.scss";

.container {
  height: 60vh; 
  display: flex;
  justify-content: center;
  align-items: center;
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
</style>
