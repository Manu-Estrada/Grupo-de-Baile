import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    
    {
      path: '/nuestroseventos',
      name: 'ourevents',
      component: () => import('../views/OurEventsView.vue')
    },
    {
      path: '/nuestrosviajes',
      name: 'ourtravels',
      component: () => import('../views/OurTravelsView.vue')
    },
     {
      path: '/galeriaviajes',
      name: 'gallerytravels',
      component: () => import('../views/GalleryTravelsView.vue')
    },
    {
      path: '/sobrenosotros',
      name: 'aboutus',
      component: () => import('../views/AboutUsView.vue')
    },
    {
      path: '/quienessomos',
      name: 'whowweare',
      component: () => import('../views/WhoWeAreView.vue')
    },
    {
      path: '/contacto',
      name: 'contact',
      component: () => import('../views/FormContactView.vue')
    },
    {
      path: '/login',
      name: 'login',
      component: () => import('../views/FormLoginView.vue')
    },
    {
      path: '/registrousuario',
      name: 'registeruser',
      component: () => import('../views/RegisterUserView.vue')
    },
    {
      path: '/registrofotousuario/:id',
      name: 'registerimguser',
      props: true,
      component: () => import('../views/RegisterImgUserView.vue')
    },
  ]
})

export default router
