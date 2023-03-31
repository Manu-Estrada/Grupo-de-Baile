<script setup>
import FormLoginView from '../views/FormLoginView.vue';

</script>

<template>
  
  
    <form class="wrapper">
      <h1>Login</h1>
      <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Usuario:</label>
        <input
          type="email"
          class="form-control"
          id="exampleInputEmail1"
          aria-describedby="emailHelp"
        />
      </div>
      <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label"
          >Contraseña:</label
        >
        <input
          type="password"
          class="form-control"
          id="exampleInputPassword1"
        />
      </div>
      <div class="btn-container">
      <button type="submit" id="btn-delete" class="btn btn">Borrar</button>
      <button type="submit" id="btn-send" class="btn btn">Enviar</button>
    </div>
    </form>

 
</template>

<style lang="scss" scoped>
@import "../assets/sass/variables";

body {
  .wrapper {
    width: 80%;
    height: 60%;
    margin: 5em;
    padding: 5em;
    background-color: rgba(255, 255, 255, 0.75);
    border-radius: .5em;
    display: flex;
    flex-direction: column;
    justify-content: space-around;

    h1{
        text-align: center;
        font-weight: bold;
    }

    .form-label{
        color: #336644;
        font-weight: bold;
        font-size: 1.5vh;
    }

    #btn-delete {
      background-color: #cc0033;
      width: 20vw;
      color: #feffd7;
      font-size: 1.5vh;
    }

    #btn-send {
      background-color: #336644;
      width: 20vw;
      color: #feffd7;
      font-size: 1.5vh;
    }
    .btn-container{
        display: flex;
        justify-content:space-around;
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
    border-radius: .5em;
    display: flex;
    flex-direction: column;
    justify-content: space-around;

    h1{
        text-align: center;
        font-weight: bold;
    }

    .form-label{
        color: #336644;
        font-weight: bold;
    }

    #btn-delete {
      background-color: #cc0033;
      width: 10vw;
      color: #feffd7;
    }

    #btn-send {
      background-color: #336644;
      width: 10vw;
      color: #feffd7;
    }
    .btn-container{
        display: flex;
        justify-content:flex-end;
        gap: 1.5vw;
        margin-right: 1vw;
     }
   }
 }
}
</style>
