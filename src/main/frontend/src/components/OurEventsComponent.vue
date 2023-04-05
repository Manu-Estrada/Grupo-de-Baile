<script setup></script>
<template>
  <div class="card-container">
    <img src="../assets/images/IMG_20190928_181206.jpg" alt="" />
    <div class="text-container">
      <span>01-01-2023</span>
      <h4>Evento Primero</h4>
      <p>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed laoreet
        facilisis dapibus. Donec aliquet ligula ipsum, tincidunt viverra risus
        malesuada ac. Curabitur fringilla sapien sit amet ex mollis finibus.
        Praesent molestie lectus sit amet tortor condimentum consectetur. Orci
        varius natoque penatibus et magnis dis parturient montes, nascetur
        ridiculus mus.
      </p>
      <div>
        <button>Ver más</button>
      </div>
    </div>
  </div>
</template>
<style lang="scss" scoped>
@import "../assets/sass/variables";
.card-container {
  display: flex;
  width: 90%;
  background-color: $background-card;
  margin-bottom: 40px;
  img {
    width: 25%;
  }
  .text-container {
    display: flex;
    flex-direction: column;
    justify-content: space-evenly;
    padding: 15px;
    span {
      font-style: italic;
      font-size: 14px;
    }
    div {
      display: flex;
      justify-content: end;
      width: 100%;
      button {
        width: 14rem;
        border-radius: 10px;
        border: none;
        background-color: $background-green;
        color: white;
        height: 3rem;
      }
    }
  }
}
@media (max-width: 1024px) {
  .card-container {
  img {
    width: 30%;
  }
  .text-container {
    p{
      font-size: 70%;
    }
    div {
      button {
        width: 12rem;
        height: 2.5rem;
      }
    }
  }
}
}
@media (max-width: 768px) {
  .card-container {
  img {
    width: 40%;
  }
  .text-container {
    p{
      font-size: 60%;
    }
    div {
      button {
        width: 10rem;
        height: 2rem;
      }
    }
  }
}
}
@media (max-width: 426px) {
  .card-container {
  display: flex;
  flex-direction: column;
  img {
    width: 100%;
  }
  .text-container {
    span {
    }
    div {
      button {
        width: 10rem;
        height: 2rem;
      }
    }
  }
}
}
</style>
