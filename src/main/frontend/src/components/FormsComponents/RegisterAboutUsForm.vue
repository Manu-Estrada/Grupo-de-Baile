<script setup>
import router from '../../router';
let aboutUs = {
  name: "",
  description: ""
};


async function save() {
  if (aboutUs.name === "") {
    alert("Se necesita añadir el nombre.");
    return;
  }

  if (aboutUs.description  === "") {
    alert("Se necesita añadir una desccripción.");
    return;
  }

  let resultados = {};

  const payload = JSON.stringify(aboutUs);
  const url = "http://localhost:8080/api/aboutus";
  const response = fetch(url, {
    method: "POST",
    body: payload,
    headers: {
      "Content-type": "application/json",
      Accept: "application/json",
    },
  })
    .then((response) => response.json())
    .then((data) => {
      if (data.aboutUs != "") {
        router.push('/registrofotosobrenosotros/' + data.id);
        alert("Sección " + data.name + " añadida correctamente.");
      } else {
        alert("Se ha producido un error. \nPor favor, inténtelo de nuevo en unos minutos.");
      }
    });
}
</script>

<template>
  <form>
    <div class="container mt-2">
      <div class="col-12 col-md-8">
        <h2 class="mt-2">Añadir un nueva sección a Sobre nosotros</h2>
        <div class="mb-3">
          <label for="name" class="form-label">Nombre</label>
          <input
            v-model="aboutUs.name"
            id="name"
            class="form-control"
            type="text"
            placeholder="Nombre"
          />
        </div>
        <div class="mb-3">
          <label for="surname" class="form-label">Descripción</label>
          <input
            v-model="aboutUs.description"
            id="description"
            class="form-control"
            type="rextarea"
            placeholder="description"
          />
        </div>
      </div>
      <div class="d-flex w-80 mb-3 mt-3">
        <button
          @click.prevent="save"
          type="submit"
          class="btn btn-success me-2 w-50"
        >
          Enviar
        </button>
        <button type="reset" class="btn btn-danger w-50">Borrar</button>
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

@media (min-width: 768px) {
  .w-10 {
    width: 10%;
  }
}
</style>
