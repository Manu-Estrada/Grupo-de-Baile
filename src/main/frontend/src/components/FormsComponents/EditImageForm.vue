<script setup>
import { useRouter } from 'vue-router';
import { imageUser } from '../../stores/imageUser';
import { computed } from '@vue/reactivity';

const userImageToModify = imageUser();
const userImageData = computed(() => {
    return userImageToModify.userImageObject;
} );

let imageMember = {
    image: userImageToModify.userImageObject.imageuser   
};

const router = useRouter();

async function updateImage(id){
    if(member.image === ""){
        alert("Se necesita añadir una imagen");
        return;
    }

    const payload = JSON.stringify(member);
    const url = `http://localhost:8080/api/users/${id}`;
    const response = fetch(url, {
        method: "DELETE",
        body: payload,
    headers: {
      "Content-type": "application/json",
      Accept: "application/json",
    },
    })
    .then((response) => response.json())
    .then((data) => {
        if (data.user != ""){
            userImageToModify.userImageObject = member;
            alert(data.user + "actualizada imagen correctamente");
        } else{
            alert("ERROOOOOOOOR");
        }
    });
}

</script>

<template>
  <form>
    <div class="container mt-2">
      <div class="col-12 col-md-8">
        <h2 class="mt-2">Modificar imagen  </h2>
        <div class="mb-3">
          <label for="name" class="form-label">NOMBREs</label>
          <input id="name" class="form-control" type="text" placeholder="Nombre" />
        </div>
        <div class="mb-3">
          <label for="surname" class="form-label">APELLIDOs</label>
          <input id="surname" class="form-control" type="text" placeholder="Apellidos" />
        </div>
        <div class="mb-3">
          <label for="date" class="form-label">Fecha de ingreso</label>
          <input id="date" class="form-control" type="date"
            placeholder="Fecha de ingreso" />
        </div>
        <div class="mb-3">
          <label for="email" class="form-label">Email</label>
          <input id="email" class="form-control" type="email" placeholder="Email" />
        </div>
        <div class="mb-3">
          <label for="password" class="form-label">Contraseña</label>
          <input  id="password" class="form-control" type="password" placeholder="Contraseña" />
        </div>
      </div>
      <div class="d-flex mb-3 mt-3">
        <button  type="submit" class="btn btn-success me-2">
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

@media (min-width: 768px) {
  .w-10 {
    width: 10%;
  }
}
</style>
