import { createWebHistory, createRouter } from "vue-router"
import Login from "@/views/LoginTest.vue"
import Home from "@/views/HomePage.vue"
import PageNotFound from '@/views/PageNotFound.vue'
import Dashboard from '@/views/DashBoard.vue'
import QuiSommesNous from '@/views/QuiSommesNous.vue'


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
    path: "/dashboard/:catchAll(.*)*",
    name: "dash_home",
    component: Dashboard,
  },
  {
  path: "/presentation",
  name: "QuiSommesNous",
  component: QuiSommesNous,
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