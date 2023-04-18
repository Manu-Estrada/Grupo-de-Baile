<script setup>
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
  }
}
</script>

<template>
  <div class="container">
    <div class="row">
      <div class="col-12 mt-4 mb-4">
        <label for="imagen"  class="form-label">Imagen</label>
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
</style>
