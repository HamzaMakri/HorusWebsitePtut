import { createWebHistory, createRouter } from "vue-router"
import Login from "@/views/LoginTest.vue"
import Home from "@/views/HomePage.vue"
import PageNotFound from '@/views/PageNotFound.vue'


const routes = [
  {
    path: "/login",
    name: "login",
    component: Login,
  },
  {
    path: "/",
    name: "home",
    component: Home,
  },
  {
    path: '/:catchAll(.*)*',
    name: "PageNotFound",
    component: PageNotFound,
  },
]



const router = createRouter({
    history: createWebHistory(),
    routes
  })
  
  export default router