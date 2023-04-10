 <script setup>
const props = defineProps({
    member: {
        type: Object,
        required: true,
      },
});
</script>
<template> 
   <main>
   <div class="card">
      <img class="imgCard" :src="`http://localhost:8080/images/user-fotos/${member.imageUser.image}`" alt="Imagen"  />
      <div class="card-body pt-1">
        <p class="card-text"><small class="text-muted"> {{ member.dateadmission }}</small></p>
        <h5 class="card-title"> {{ member.name }}  {{ member.lastname }}</h5>
      <div id="containerBtnMemebrs">
        <a data-bs-toggle="modal"  data-bs-target="#exampleModal" class="btn btn-primary" id="Btn-see" >Ampliar</a>
      </div>
    </div>
   </div> 
  </main> 

   <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" id="modalDialog">
    <div class="modal-content bg-transparent" id="boxImg">
        <div class="d-flex justify-content-end">
        <button  type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close" id="btnClosed" ></button>
      </div>
        <!-- <img src="../assets/images/foto3.jpg" data-bs-toggle="modal" data-bs-target="#exampleModal"/> -->
        <img class="imgCard" :src="`http://localhost:8080/images/user-fotos/${member.imageUser.image}`" data-bs-toggle="modal" data-bs-target="#exampleModal" alt="Imagen"  />
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
