import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: HomeView,
    },

    {
      path: "/nuestroseventos",
      name: "ourevents",
      component: () => import("../views/OurEventsView.vue"),
    },
    {
      path: "/nuestrosviajes",
      name: "ourtravels",
      component: () => import("../views/OurTravelsView.vue"),
    },
    {
      path: "/galeriaviajes",
      name: "gallerytravels",
      component: () => import("../views/GalleryTravelsView.vue"),
    },
    {
      path: "/sobrenosotros",
      name: "aboutus",
      component: () => import("../views/AboutUsView.vue"),
    },
    {
      path: "/quienessomos",
      name: "whowweare",
      component: () => import("../views/WhoWeAreView.vue"),
    },
    {
      path: "/contacto",
      name: "contact",
      component: () => import("../views/FormContactView.vue"),
    },
    {
      path: "/login",
      name: "login",
      component: () => import("../views/FormLoginView.vue"),
    },
    {
      path: "/registrousuario",
      name: "registeruser",
      component: () => import("../views/RegisterUserView.vue"),
    },
    {
      path: "/registrofotousuario/:id",
      name: "registerimguser",
      props: true,
      component: () => import("../views/RegisterImgUserView.vue"),
    },
    {
      path: "/listausuario",
      name: "listuser",
      component: () => import("../views/ListUserView.vue"),
    },
    {
      path: "/modificarusuario/:id",
      name: "edituser",
      props: true,
      component: () => import("../views/EditUserView.vue"),
    },
    {
      path: "/modificarimagenusuario",
      name: "editimageuser",
      props: true,
      component: () => import("../views/EditUserImage.vue")
    },
    {
      path: "/listasobrenosotros",
      name: "listaboutus",
      props: true,
      component: () => import("../views/ListAboutUsView.vue")
    },
    {
      path: "/registrosobrenosotros",
      name: "registeraboutus",
      props: true,
      component: () => import("../views/RegisterAboutUsView.vue")
    },
    {
      path: "/registrofotosobrenosotros/:id",
      name: "registerimgaboutus",
      props: true,
      component: () => import("../views/RegisterImgAboutUsView.vue"),
    },
    {
      path: "/modificarsobrenosotros/:id",
      name: "editaboutus",
      props: true,
      component: () => import("../views/EditAboutUsView.vue")
    },

    {
      path: "/registronuestrosviajes",
      name: "registerourtravels",
      props: true,
      component: () => import("../views/RegisterOurTravelsView.vue")
    },

    {
      path: "/registrofotosviajes/:id",
      name: "registerourtravelsimg",
      props: true,
      component: () => import("../views/RegisterOurTravelsImgView.vue")
    },
    {
      path: "/listaviajes",
      name: "travellist",
      props: true,
      component: () => import("../views/ListOurTravelsView.vue")
    },
    {
      path: "/modificarnuestrosviajes/:id",
      name: "editourtravels",
      props: true,
      component: () => import("../views/EditOurTravelsView.vue"),
    }
  ],
});

export default router;
