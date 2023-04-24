<script setup>
import { useAuthStore } from "../stores/auth-storage"
import AuthService from "../assets/ApiRepository/authentication/authService";
import router from "../router";

let userName = "";
let password = "";
const store = useAuthStore();

const submitData = async () => {
  const authService = new AuthService();
  const response = await authService.login(userName, password);
  router.push("/");
};

</script>

<template>
  <form class="wrapper">
    <h1>Login</h1>
    <div class="mb-3">
      <label for="exampleInputEmail1" class="form-label">Usuario:</label>
      <input
        type="email"
        v-model="userName"
        class="form-control"
        id="email"
        aria-describedby="emailHelp"
      />
    </div>
    <div class="mb-3">
      <label for="exampleInputPassword1" class="form-label">Contraseña:</label>
      <input v-model="password" type="password" class="form-control" id="password" />
    </div>
    <div class="btn-container">
      <button type="submit" id="btn-delete" class="btn btn">Borrar</button>
      <button type="submit" id="btn-send" class="btn btn" @click="submitData">Enviar</button>
    </div>
  </form>
</template>

<style lang="scss" scoped>
@import "../assets/sass/variables";

body {
  .wrapper {
    width: 92%;
    height: 60%;
    margin: 5em;
    padding: 5em;
    background-color: rgba(255, 255, 255, 0.75);
    border-radius: 0.5em;
    display: flex;
    flex-direction: column;
    justify-content: space-around;

    h1 {
      text-align: center;
      font-weight: bold;
    }

    .form-label {
      color: $background-green;
      font-weight: bold;
      font-size: 2vh;
    }

    #btn-delete {
      background-color: $text-red;
      width: 20vw;
      color: $background-component;
      font-size: 2vh;
    }

    #btn-send {
      background-color: $background-green;
      width: 20vw;
      color: $background-component;
      font-size: 2vh;
    }
    .btn-container {
      display: flex;
      justify-content: space-around;
      gap: 1.5vw;
      margin-right: 1vw;
    }
  }
}

@media (min-width: 1024px) {
  body {
    .wrapper {
      width: 60%;
      height: 70%;
      margin: 5em;
      padding: 5em;
      background-color: rgba(255, 255, 255, 0.75);
      border-radius: 0.5em;
      display: flex;
      flex-direction: column;
      justify-content: space-around;

      h1 {
        text-align: center;
        font-weight: bold;
      }

      .form-label {
        color: $background-green;
        font-weight: bold;
      }

      #btn-delete {
        background-color: $text-red;
        width: 10vw;
        color: $background-component;
      }

      #btn-send {
        background-color: $background-green;
        width: 10vw;
        color: $background-component;
      }
      .btn-container {
        display: flex;
        justify-content: flex-end;
        gap: 1.5vw;
        margin-right: 1vw;
      }
    }
  }
}
</style>
