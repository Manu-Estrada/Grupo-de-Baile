<script setup>
import { useRouter } from "vue-router";

let usercontact = {
  inputName: "",
  from: "",
  inputPhone: "",
  message: "",
};
//onReset: Para borrar info de formulario después de enviar, pero no funciona...


const router = useRouter();

async function save() {
  if (usercontact.inputName === "") {
    alert("Se necesita añadir el nombre.");
    return;
  }

  if (usercontact.from === "") {
    alert("Se necesita añadir un correo electrónico válido.");
    return;
  }

  if (usercontact.inputPhone === "") {
    alert("Se necesita añadir un teléfono.");
    return;
  }

  if (usercontact.message === "") {
    alert("Se necesita añadir un mensaje.");
    return;
  }

  let resultados = {};

  const payload = JSON.stringify(usercontact);
  const url = "http://localhost:8080/api/sendemail";
  const response = fetch (url, {
    method: "POST",
    body: payload,
    headers: {
      "Content-type": "application/json",
      Accept: "application/json",
    },
  }).then((response) => {
    if (response.status == 200) {
      alert("Mensaje enviado satisfactoriamente.");
     
     document.getElementById("formContact").reset()

    } else {
      alert(
        "Se ha producido un error. \nPor favor, revise la información introducida en los campos."
      );
    }
  });
}
</script>
<template>
  <div  class="container">
    <h1>Contáctanos</h1>
    <p class="titleDescrip">
      Lorem, ipsum dolor sit amet consectetur adipisicing elit. Adipisci
      repellendus dolor consequatur. Vitae animi molestias placeat dolorem
      doloremque, praesentium, a unde quibusdam suscipit necessitatibus
      assumenda nostrum ipsa rerum provident tempore!
    </p>
  </div>
  <div class="container d-flex justify-content-center">
    <div id="formStyle">
      <form id="formContact" class="row g-3">
        <div class="col-12">
          <label for="inputName" class="form-label">Nombre:</label>
          <input
            v-model="usercontact.inputName"
            type="text"
            class="form-control"
            id="inputName"
          />
        </div>
        <div class="col-12">
          <label for="from" class="form-label">Email:</label>
          <input
            v-model="usercontact.from"
            type="email"
            class="form-control"
            id="from"
          />
        </div>
        <div class="col-12">
          <label for="inputPhone" class="form-label">Teléfono:</label>
          <input
            v-model="usercontact.inputPhone"
            type="text"
            class="form-control"
            id="inputPhone"
          />
        </div>
        <div class="col-12">
          <label for="message" class="form-label"
            >Tu consulta o comentario:</label
          >
          <textarea
            v-model="usercontact.message"
            class="form-control"
            id="exampleFormControlTextarea1"
            rows="7"
          ></textarea>
        </div>
        <div class="col-12 d-flex justify-content-end">
          <button type="reset" class="btn btn-danger">Borrar</button>
          <button @click="save" type="button" class="btn btn-success">
            Enviar
          </button>
          
        </div>
      </form>
    </div>
  </div>
</template>
<style lang="scss" scoped>
@import "../../assets/sass/variables";
#formStyle {
  width: 80%;
  margin-bottom: 3em;
}
h1 {
  margin-top: 1em;
}
.titleDescrip {
  margin: 3em 0em 2em 0em;
}
button {
  width: 10em;
}
.btn-success {
  margin-left: 2.5em;
}
.form-label {
  margin-left: 0.5em;
  font-weight: bold;
  color: $background-green;
}
</style>
