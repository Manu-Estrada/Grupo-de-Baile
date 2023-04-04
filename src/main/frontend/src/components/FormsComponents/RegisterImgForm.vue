<script setup>
</script>

<template>
<div class="container">
    <div class="row">
        <div class="col-12 mt-4 mb-4 ">
          <label for="imagen" class="form-label">Imagen</label>
    <input type="file" class="form-control" placeholder="añade foto">
</div>
</div>
</div>
</template>
<style lang="scss" scoped>

@import "../../assets/sass/variables";
@import "../../assets/sass/global.scss";
.container {
    height: 80vh;
    width: 80%;
  max-width: none;
  margin: 0 auto;
  display: flex;
  justify-content: space-around;
  align-items: center;
  flex-direction: column;

  height: 100%;
}
.form-control {
  width: 100%;
  border-radius: 10px;
}
.label{
  font-family: $font-text;

}
input {
  width: 100%;
}
</style>