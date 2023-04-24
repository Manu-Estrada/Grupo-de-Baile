<script setup>
import { computed } from "@vue/reactivity";
import { ourEvents } from "../../stores/ourEvents";

const ourEventsToModify = ourEvents();
const ourEventsData = computed(() => {
  return ourEventsToModify.ourEventsObject;
});

let ourEventsEdit = {
  name: ourEventsToModify.ourEventsObject.name,
  description: ourEventsToModify.ourEventsObject.description,
  dateevent: ourEventsToModify.ourEventsObject.dateevent,
};

async function update(id) {
  if (ourEventsEdit.name === "") {
    alert("Se necesita añadir un nombre al evento.");
    return;
  }

  if (ourEventsEdit.description === "") {
    alert("Se necesita añadir una fecha al evento.");
    return;
  }


  const payload = JSON.stringify(ourEventsEdit);
  const url = `http://localhost:8080/api/events/${id}`;
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
        ourEventsToModify.ourEventsObject = ourEventsEdit;
        alert("Evento " + ourEventsEdit.name + " actualizado correctamente.");
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
        <h2 class="mt-2">Modificar evento {{ ourEventsData.name }}</h2>
        <div class="mb-3">
          <label for="name" class="form-label">Nombre</label>
          <input v-model="ourEventsEdit.name" id="name" class="form-control" type="text" placeholder="Nombre" />
        </div>
        <div class="mb-3">
          <label for="date" class="form-label">Fecha del viaje </label>
          <input v-model="ourEventsEdit.dateevent" id="dateevent" class="form-control" type="date"
            placeholder="Fecha del viaje" />
        </div>
        <div class="mb-3">
          <label for="surname" class="form-label">Descripción</label>
          <textarea v-model="ourEventsEdit.description" id="description" class="form-control" type="rextarea"
            placeholder="description" />
        </div>
      </div>
      <div class="d-flex mb-3 mt-3">
        <button @click.prevent="update(ourEventsData.id)" type="submit" class="btn btn-success me-2">
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
