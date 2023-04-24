<script setup>
import router from "../../router";
import { userStore } from "../../stores/userStore";

const userToAdd = userStore();

let member = {
  name: "",
  lastname: "",
  dateadmission: "",
  userStorename: "",
  password: "",
};


async function save() {
  if (member.name === "") {
    alert("Se necesita añadir el nombre.");
    return;
  }

  if (member.lastname === "") {
    alert("Se necesita añadir los apellidos.");
    return;
  }

  if (member.dateadmission === "") {
    alert("Se necesita añadir la fecha de ingreso.");
    return;
  }

  const payload = JSON.stringify(member);
  const url = "http://localhost:8080/api/register";
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
      if (data.name) {
        userToAdd.userObject = data;
        alert(data.name + " añadido correctamente.");
        router.push('/registrofotousuario/' + data.id);
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
        <h2 class="mt-2">Añadir un nuevo miembro</h2>
        <div class="mb-3">
          <label for="name" class="form-label">Nombre</label>
          <input
            v-model="member.name"
            id="name"
            class="form-control"
            type="text"
            placeholder="Nombre"
          />
        </div>
        <div class="mb-3">
          <label for="surname" class="form-label">Apellidos</label>
          <input
            v-model="member.lastname"
            id="surname"
            class="form-control"
            type="text"
            placeholder="Apellidos"
          />
        </div>
        <div class="mb-3">
          <label for="date" class="form-label">Fecha de ingreso</label>
          <input
            v-model="member.dateadmission"
            id="date"
            class="form-control"
            type="date"
            placeholder="Fecha de ingreso"
          />
        </div>
        <div class="mb-3">
          <label for="email" class="form-label">Email</label>
          <input
            v-model="member.username"
            id="email"
            class="form-control"
            type="email"
            placeholder="Email"
          />
        </div>
        <div class="mb-3">
          <label for="password" class="form-label">Contraseña</label>
          <input
            v-model="member.password"
            id="password"
            class="form-control"
            type="password"
            placeholder="Contraseña"
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
