<script setup>
const props = defineProps({
  id: {
    type: String,
  }
})
</script>


<template>
  <div class="container">
    <div class="row">
      <div class="col-12 mt-4 mb-4">
        <label for="imagen"  class="form-label">Imagen {{ id }}</label>
        <input type="file" class="form-control" placeholder="añade foto">
      </div>
    </div>
  </div>
</template>

<style lang="scss" scoped>
@import "../../assets/sass/variables";
@import "../../assets/sass/global.scss";

.container {
  height: 60vh; 
  display: flex;
  justify-content: center;
  align-items: center;
}

.form-label {
  font-size: 1.25rem; 
  font-weight: bold;
}

.form-control {
  border-radius: 10px;
}

// @media (min-width: 576px) { 
//   .container {
//     height: 60vh;
//   }
// }

</style>
