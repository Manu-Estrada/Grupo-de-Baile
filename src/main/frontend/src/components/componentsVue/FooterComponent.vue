<script setup>

</script>

<template>

<footer class="footer">
    <div class="footer__container-title">
      <h2 class="footer__container-title__copyright">&copy; Xareu D' Ochobre</h2>
    </div>
    <div class= "footer__map" style="width: 20%" height="5%"><iframe class="footer__map-iframe" width="100%" height="90%" frameborder="0" scrolling="no" marginheight="5%" marginwidth="0" src="https://maps.google.com/maps?width=100%25&amp;height=600&amp;hl=en&amp;q=C/El%20Alamo%20N%C2%BA2,%20Avil%C3%A9s,%20Spain+(Xar%C3%A9u%20D%20Ochobre%20Aviles)&amp;t=&amp;z=14&amp;ie=UTF8&amp;iwloc=B&amp;output=embed"><a href="https://www.gps.ie/sport-gps/">swimming watch</a></iframe></div>
    <div class="footer__container-social-media">
        
        <p><a href=" https://www.facebook.com/profile.php?id=100051181520137" target="_blank"><img class= "icon-face" src="../../assets/images/icon-Facebook.png" alt="facebbok-icon"></a></p> 
        <p><a href="https://instagram.com/xareu_d_ochobre?igshid=YmMyMTA2M2Y=" target="_blank"><img class="icon-insta" src="../../assets/images/icon-Instagram.png" alt="instagram-icon"></a></p> 
 
  </div>
  </footer>
</template>

<style lang = "scss" scoped>
 
 .footer {
  background-color: #336644;
  display: flex;
  justify-content:space-around;
  color: white;
  align-items: center;
  
  &__container-title{
     display: flex;
     
    &__copyright{
    font-size: 2vh;
    
    }

}
  &__map{
    width: 10%;
    height: auto;
    display: flex;
    align-items: center;
    justify-content: space-evenly;
    margin-block: 1vh;
    cursor: pointer;
    &__iframe{
      width: 20%;
      height: auto;
    }
  }
     
    &__container-social-media{
      width: 1vw;
      height: 1vh;
      display: flex;
      flex-direction: row;
      justify-content: flex-end;
      gap: 1vw;
      cursor: pointer;
      
      }
      
    }



@media (min-width: 1024px) {
.footer {
  background-color: #336644;
  display: flex;
  justify-content:space-around;
  color: white;
  align-items: center;
  
  &__container-title{
     
    &__copyright{
    font-size: 3vh;
    
    }

}
  &__map{
    display: flex;
    align-items: center;
    justify-content: space-evenly;
    margin-block: 3vh;
    cursor: pointer;
  }
     
    &__container-social-media{
      width: 5vw;
      height: 5vh;
      display: flex;
      flex-direction: row;
      justify-content: space-around;
      gap: 2vw;
      cursor: pointer;
      
      }
      
    }
}
  
  </style>