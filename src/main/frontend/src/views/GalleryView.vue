<script setup>
import NavbarComponent from '../components/NavbarComponent.vue';

 
</script>
<template>
<header>
  <NavbarComponent/>
</header>
<main>
  <div class="container">
  <h1>HOPLA</h1>
  <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Consequuntur quae repellendus maiores iure, nemo quia nam suscipit delectus voluptates consectetur, placeat nulla cumque magni ipsam numquam eveniet distinctio, commodi facere.</p>
    <!-- Button trigger modal -->
  </div>
<div class="container">
  <div id="imgsContainer">
<img id="mainImg" type="button" src="https://lh5.googleusercontent.com/_T4ZV2_ZON54aqxKpkWqnwVa8u43Sfe0c0aM5PWoktF_vGqp5xDmVCR_Fpfys_UQmtM=w1200-h630-p" data-bs-toggle="modal" data-bs-target="#exampleModal">
<img id="mainImg" type="button" src="https://lh5.googleusercontent.com/_T4ZV2_ZON54aqxKpkWqnwVa8u43Sfe0c0aM5PWoktF_vGqp5xDmVCR_Fpfys_UQmtM=w1200-h630-p" data-bs-toggle="modal" data-bs-target="#exampleModal">
<img id="mainImg" type="button" src="https://lh5.googleusercontent.com/_T4ZV2_ZON54aqxKpkWqnwVa8u43Sfe0c0aM5PWoktF_vGqp5xDmVCR_Fpfys_UQmtM=w1200-h630-p" data-bs-toggle="modal" data-bs-target="#exampleModal">
<img id="mainImg" type="button" src="https://lh5.googleusercontent.com/_T4ZV2_ZON54aqxKpkWqnwVa8u43Sfe0c0aM5PWoktF_vGqp5xDmVCR_Fpfys_UQmtM=w1200-h630-p" data-bs-toggle="modal" data-bs-target="#exampleModal">
<img id="mainImg" type="button" src="https://lh5.googleusercontent.com/_T4ZV2_ZON54aqxKpkWqnwVa8u43Sfe0c0aM5PWoktF_vGqp5xDmVCR_Fpfys_UQmtM=w1200-h630-p" data-bs-toggle="modal" data-bs-target="#exampleModal">
<img id="mainImg" type="button" src="https://lh5.googleusercontent.com/_T4ZV2_ZON54aqxKpkWqnwVa8u43Sfe0c0aM5PWoktF_vGqp5xDmVCR_Fpfys_UQmtM=w1200-h630-p" data-bs-toggle="modal" data-bs-target="#exampleModal">
<img id="mainImg" type="button" src="https://lh5.googleusercontent.com/_T4ZV2_ZON54aqxKpkWqnwVa8u43Sfe0c0aM5PWoktF_vGqp5xDmVCR_Fpfys_UQmtM=w1200-h630-p" data-bs-toggle="modal" data-bs-target="#exampleModal">
<img id="mainImg" type="button" src="https://lh5.googleusercontent.com/_T4ZV2_ZON54aqxKpkWqnwVa8u43Sfe0c0aM5PWoktF_vGqp5xDmVCR_Fpfys_UQmtM=w1200-h630-p" data-bs-toggle="modal" data-bs-target="#exampleModal">
<img id="mainImg" type="button" src="https://lh5.googleusercontent.com/_T4ZV2_ZON54aqxKpkWqnwVa8u43Sfe0c0aM5PWoktF_vGqp5xDmVCR_Fpfys_UQmtM=w1200-h630-p" data-bs-toggle="modal" data-bs-target="#exampleModal">

</div>
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" id="modalDialog">
    <div class="modal-content bg-transparent" id="boxImg">
        <div class="d-flex justify-content-end">
        <button type="button" class="btn-close bg-success" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
        <img src="https://lh5.googleusercontent.com/_T4ZV2_ZON54aqxKpkWqnwVa8u43Sfe0c0aM5PWoktF_vGqp5xDmVCR_Fpfys_UQmtM=w1200-h630-p" width="1357px" height="650px">
    </div>
  </div>
</div>
</div>
</main>
</template>
<style scoped> 
#mainImg{
  width: 400px;
  height: 234px;
  margin-bottom: 1em;
}
#imgsContainer{
  display: flex;
  flex-wrap: wrap;
  justify-content: space-around;
}
#boxImg{
  width: 84.7em;
  border-style: none;
}
#modalDialog{
  max-width: none;
  margin-left: 5em;
  margin-right: 5em;
}
</style>