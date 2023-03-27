<script setup>

</script>

<template>
  <main>
   <div class="card">
    <img src="https://lh5.googleusercontent.com/_T4ZV2_ZON54aqxKpkWqnwVa8u43Sfe0c0aM5PWoktF_vGqp5xDmVCR_Fpfys_UQmtM=w1200-h630-p" />
  <div class="card-body pt-1">
    <p class="card-text"><small class="text-muted">01-01-2023</small></p>
    <h5 class="card-title">Primer Viaje</h5>
    <!-- <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p> -->
    <div id="containerBtn">
      <a href="#" class="btn btn-primary" id="Btn-see">Ver más</a>
    </div>
  </div>
</div>
  </main>
</template>
<style scoped>
.card{
border-radius: 0%;
border-style: none;
width: 400px;
margin-bottom: 2em;
}
.card-text{
  margin: 0%;
  font-style: italic;
}
.card-body{
  background-color: #FEFFD7;
}
#containerBtn{
display: flex;
justify-content: end;
}
#Btn-see{
  background-color: #336644;
  width: 160px;
}
</style>
