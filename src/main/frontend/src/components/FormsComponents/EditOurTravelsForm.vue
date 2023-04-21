<script setup>
import { computed } from "@vue/reactivity";
import { ourTravels } from "../../stores/ourTravels";

const ourTravelsToModify = ourTravels();
const ourTravelsData = computed(() => {
  return ourTravelsToModify.ourTravelsObject;
});

let ourTravelsEdit = {
  name: ourTravelsToModify.ourTravelsObject.name,
  description: ourTravelsToModify.ourTravelsObject.description,
  id: ourTravelsToModify.ourTravelsObject.id,
  datetravel: ourTravelsToModify.ourTravelsObject.datetravel,
};

async function update(id) {
  if (ourTravelsEdit.name === "") {
    alert("Se necesita añadir un nombre al viaje.");
    return;
  }

  if (ourTravelsEdit.description === "") {
    alert("Se necesita añadir una descripción al viaje.");
    return;
  }

  if (ourTravelsEdit.datetravel === "") {
    alert("Se necesita añadir una fecha al viaje.");
    return;
  }

  const payload = JSON.stringify(ourTravelsEdit);
  const url = `http://localhost:8080/api/travels/${id}`;
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
        ourTravelsToModify.ourTravelsObject = ourTravelsEdit;
        alert("Sección " + ourTravelsEdit.name + " actualizada correctamente.");
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
        <h2 class="mt-2">Modificar viaje {{ ourTravelsData.name }}</h2>
        <div class="mb-3">
          <label for="date" class="form-label">Fecha</label>
          <input
            v-model="ourTravelsEdit.datetravel"
            id="date"
            class="form-control"
            type="date"
            placeholder="Fecha de ingreso"
          />
        </div>
        <div class="mb-3">
          <label for="name" class="form-label">Nombre</label>
          <input
            v-model="ourTravelsEdit.name"
            id="name"
            class="form-control"
            type="text"
            placeholder="Nombre"
          />
        </div>
        <div class="mb-3">
          <label for="surname" class="form-label">Apellidos</label>
          <textarea
            v-model="ourTravelsEdit.description"
            id="description"
            class="form-control"
            placeholder="Descripción"
          />
        </div>
      </div>
      <div class="d-flex mb-3 mt-3">
        <button
          @click.prevent="update(ourTravelsData.id)"
          type="submit"
          class="btn btn-success me-2"
        >
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
