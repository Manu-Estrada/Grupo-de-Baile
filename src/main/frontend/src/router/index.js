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
  ]
})

export default router
