<script setup>
import { computed } from "@vue/reactivity";
import { aboutUs } from "../../stores/aboutUs";

const aboutUsToModify = aboutUs();
const aboutUsData = computed(() => {
  return aboutUsToModify.aboutUsObject;
});

let aboutUsEdit = {
  name: aboutUsToModify.aboutUsObject.name,
  description: aboutUsToModify.aboutUsObject.description,
  id: aboutUsToModify.aboutUsObject.id,
  position: aboutUsToModify.aboutUsObject.position,
};

async function update(id) {
  if (aboutUsEdit.name === "") {
    alert("Se necesita añadir un nombre da la sección.");
    return;
  }

  if (aboutUsEdit.description === "") {
    alert("Se necesita añadir una descripción a la sección.");
    return;
  }

  if (aboutUsEdit.position === "") {
    alert("Se necesita indicar la posición en el listado.");
    return;
  }


  const payload = JSON.stringify(aboutUsEdit);
  const url = `http://localhost:8080/api/aboutus/${id}`;
  const response = fetch(url, {
    method: "PUT",
    body: payload,
    headers: {
      "Content-type": "application/json",
      Accept: "application/json",
    },
  })
    .then((response) => response.json())
    .then((data) => {
      if (data.name) {
        aboutUsToModify.aboutUsObject = aboutUsEdit;
        alert("Sección " + aboutUsEdit.name + " actualizada correctamente.");
      } else {
        alert("Se ha producido un error. \nPor favor, inténtalo más tarde.");
      }
    });
}
</script>

<template>
  <form>
    <div class="container mt-2">
      <div class="col-12 col-md-8">
        <h2 class="mt-2">Modificar sección {{ aboutUsData.name }}</h2>
        <div class="mb-3">
          <label for="name" class="form-label">Nombre</label>
          <input v-model="aboutUsEdit.name" id="name" class="form-control" type="text" placeholder="Nombre" />
        </div>

        <div class="mb-3">
          <label for="position" class="form-label">Posición en la página</label>
          <input v-model="aboutUsEdit.position" id="name" class="form-control" type="text" placeholder="Position" />
        </div>

        <div class="mb-3">
          <label for="surname" class="form-label">Descripción</label>
          <textarea v-model="aboutUsEdit.description" id="description" class="form-control" placeholder="Descripción" />
        </div>
      </div>
      <div class="d-flex mb-3 mt-3">
        <button @click.prevent="update(aboutUsData.id)" type="submit" class="btn btn-success me-2">
          Modificar
        </button>
        <button type="reset" class="btn btn-danger">Borrar</button>
      </div>
    </div>
  </form>
</template>

<style lang="scss" scoped>
@import "../../assets/sass/variables";

h2 {
  font-family: $font-text;
  text-align: center;
}

.container {
  width: 80%;
  max-width: none;
  margin: 0 auto;
  display: flex;
  justify-content: space-around;
  align-items: center;
  flex-direction: column;
  background-color: $background-component;
  height: 100%;
}

.form-control {
  width: 100%;
  border-radius: 10px;
}

.label {
  font-family: $font-text;
}

input {
  width: 100%;
  background-color: #ffffff;
}

.btn {
  width: 100%;
}

textarea {
  height: 250px;
}

@media (min-width: 768px) {
  .w-10 {
    width: 10%;
  }
}
</style>
