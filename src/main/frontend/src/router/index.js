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
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import('../views/GalleryView.vue')
    },
    {
      path: '/calendario',
      name: 'calendar',
      component: () => import('../views/CalendarUserView.vue')
    },
    {
      path: '/viajes',
      name: 'travels',
      component: () => import('../views/TravelsView.vue')
    },
     {
      path: '/galeria',
      name: 'gallery',
      component: () => import('../views/GalleryView.vue')
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
  ]
})

export default router
