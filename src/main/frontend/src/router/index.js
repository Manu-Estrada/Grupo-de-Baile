import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import { useAuthStore } from "../stores/auth-storage";

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
      path: "/galeriaviajes/:id",
      name: "gallerytravels",
      props: true,
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
      path: "/listanuestroseventos",
      name: "listourevents",
      component: () => import("../views/ListOurEventsView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/registronuestroseventos",
      name: "registerourEvents",
      component: () => import("../views/RegisterOurEventsView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/registrofotonuestroseventos/:id",
      name: "registerimgOurEvents",
      props: true,
      component: () => import("../views/RegisterImgOurEventsView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/modificarnuestroseventos/:id",
      name: "editourevents",
      props: true,
      component: () => import("../views/EditOurEventsView.vue"),
      meta: { requiresAuth: true },
    },

    {
      path: "/listausuario",
      name: "listuser",
      component: () => import("../views/ListUserView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/registrousuario",
      name: "registeruser",
      component: () => import("../views/RegisterUserView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/registrofotousuario/:id",
      name: "registerimguser",
      props: true,
      component: () => import("../views/RegisterImgUserView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/modificarusuario/:id",
      name: "edituser",
      props: true,
      component: () => import("../views/EditUserView.vue"),
      meta: { requiresAuth: true },
    },


    {
      path: "/listasobrenosotros",
      name: "listaboutus",
      props: true,
      component: () => import("../views/ListAboutUsView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/registrosobrenosotros",
      name: "registeraboutus",
      props: true,
      component: () => import("../views/RegisterAboutUsView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/registrofotosobrenosotros/:id",
      name: "registerimgaboutus",
      props: true,
      component: () => import("../views/RegisterImgAboutUsView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/modificarsobrenosotros/:id",
      name: "editaboutus",
      props: true,
      component: () => import("../views/EditAboutUsView.vue"),
      meta: { requiresAuth: true },
    },



    {
      path: "/listaviajes",
      name: "travellist",
      props: true,
      component: () => import("../views/ListOurTravelsView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/registronuestrosviajes",
      name: "registerourtravels",
      props: true,
      component: () => import("../views/RegisterOurTravelsView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/registrofotosviajes/:id",
      name: "registerourtravelsimg",
      props: true,
      component: () => import("../views/RegisterImgOurTravelsView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/modificarnuestrosviajes/:id",
      name: "editourtravels",
      props: true,
      component: () => import("../views/EditOurTravelsView.vue"),
      meta: { requiresAuth: true },
    },
    {
      path: "/listacorreos",
      name: "listacorreos",
      props: true,
      component: () => import("../views/ListOurMailView.vue"),
      meta: { requiresAuth: true },
    },
  ],
});

router.beforeEach(async (to, from) => {
  const auth = useAuthStore();
  if (to.meta.requiresAuth && !auth.isAuthenticate) {
    return { name: "home" };
  }
});

export default router;
