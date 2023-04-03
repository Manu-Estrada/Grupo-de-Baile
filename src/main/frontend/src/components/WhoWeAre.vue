<script setup>

</script>

<template>
  <main>
   <div class="card">
      <img class="imgCard" src="../assets/images/foto3.jpg" alt="Imagen"  />
      <div class="card-body pt-1">
        <p class="card-text"><small class="text-muted">01-01-2023</small></p>
        <h5 class="card-title">José García</h5>
      <div id="containerBtnMemebrs">
        <a data-bs-toggle="modal"  data-bs-target="#exampleModal" class="btn btn-primary" id="Btn-see" >Ampliar</a>
      </div>
    </div>
   </div>
  </main>

<!-- ampliar imagen -->
  <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" id="modalDialog">
    <div class="modal-content bg-transparent" id="boxImg">
        <div class="d-flex justify-content-end">
        <button  type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close" id="btnClosed" ></button>
      </div>
        <img src="https://lh5.googleusercontent.com/_T4ZV2_ZON54aqxKpkWqnwVa8u43Sfe0c0aM5PWoktF_vGqp5xDmVCR_Fpfys_UQmtM=w1200-h630-p" width="1357px" height="650px" data-bs-toggle="modal" data-bs-target="#exampleModal"/>
    </div>
  </div>
</div>


</template>
<style lang="scss" scoped>
@import "../assets/sass/_variables.scss";
@import "../assets/sass/galleryStyles/gallerystyles.scss";

.card  {

.imgCard  {
  height:10em; 
  width: 100%;
  object-fit: cover;
}
  #containerBtnMemebrs{
      display: flex;
      justify-content: center;
      }
}

</style>
