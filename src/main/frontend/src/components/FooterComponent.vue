<script setup></script>

<template>
  <footer class="footer w-100">
    <div class="footer__container-title">
      <h2 class="footer__container-title__copyright">&copy; Xaréu D'Ochobre</h2>
    </div>
    <div class="footer__container-social-media">
      <p class="icons">
        <a
          href=" https://www.facebook.com/profile.php?id=100051181520137"
          target="_blank"
          ><img
            class="image-icon"
            src="../assets/images/iconFacebook.png"
            alt="facebbok-icon"
        /></a>
      </p>
      <p class="icons">
        <a
          href="https://instagram.com/xareu_d_ochobre?igshid=YmMyMTA2M2Y="
          target="_blank"
          ><img
            class="image-icon"
            src="../assets/images/icon-Instagram.png"
            alt="instagram-icon"
        /></a>
      </p>
    </div>
  </footer>
</template>

<style lang="scss" scoped>
@import "../assets/sass/variables";

.footer {
  background-color: $background-green;
  display: flex;
  justify-content: space-around;
  flex-wrap: wrap;
  color: $background-component;
  align-items: center;

  &__container-title {
    display: flex;
    font-family: Libre Baskerville, serif;

    &__copyright {
      font-size: 2vh;
    }
  }

  &__container-social-media {
    display: flex;
    flex-direction: row;
    justify-content: flex-end;
    cursor: pointer;
  }
  .icons {
    margin: 1vh;
    opacity: 100%;
  }
  .icons a:hover {
    opacity: 50%;
  }
}

@media (min-width: 1024px) {
  .footer {
    background-color: $background-green;
    display: flex;
    // justify-content:space-around;
    flex-wrap: wrap;
    color: $background-component;
    align-items: center;

    &__container-title {
      &__copyright {
        font-size: 3vh;
      }

      &__container-social-media {
        display: flex;
        flex-direction: row;
        justify-content: space-around;
        cursor: pointer;
        max-height: 50%;
      }

      .icons {
        margin: 1vh;
      }
    }
  }
}
</style>
