<script setup>
</script>
<template>
    <div class="container">
    <h1>Contáctanos</h1>
    <p class="titleDescrip">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Adipisci repellendus dolor consequatur. Vitae animi molestias placeat dolorem doloremque, praesentium, a unde quibusdam suscipit necessitatibus assumenda nostrum ipsa rerum provident tempore!</p>
</div>
    <div class="container d-flex justify-content-center">
    <div id="formStyle">

<form class="row g-3" >
  <div class="col-12">
    <label for="inputName" class="form-label">Nombre:</label>
    <input type="text" class="form-control" id="inputName">
  </div>
  <div class="col-12">
    <label for="inputEmail" class="form-label">Email:</label>
    <input type="email" class="form-control" id="inputEmail">
  </div>
  <div class="col-12">
    <label for="inputTlf" class="form-label">Teléfono:</label>
    <input type="text" class="form-control" id="inputTlf">
  </div>
  <div class="col-12">
  <label for="exampleFormControlTextarea1" class="form-label">Tu consulta o comentario:</label>
  <textarea class="form-control" id="exampleFormControlTextarea1" rows="7"></textarea>
</div>
<div class="col-12 d-flex justify-content-end">
    <button type="reset" class="btn btn-danger">Borrar</button>
    <button type="button" class="btn btn-success">Enviar</button>
  </div>
</form>
</div>
</div>
</template>
<style lang="scss" scoped>
@import "../../assets/sass/variables";
#formStyle{
    width: 80%;
    margin-bottom: 3em;
}
h1{
    margin-top: 1em;
}
.titleDescrip{
    margin: 3em 0em 2em 0em;
}
button{
    width: 10em;
}
.btn-success{
    margin-left: 2.5em;
}
.form-label{
margin-left: 0.5em;
font-weight: bold;
color: $background-green;
}
</style>