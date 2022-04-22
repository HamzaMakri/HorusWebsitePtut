<template>
  <router-view />

  <NavBar />

  <div id="tools">
    <div
      v-if="data.permissions.includes('adduser')"
      @click="clickFeature('adduser')"
      class="tool"
    >
      <fa icon="user" />
    </div>
    <div
      v-if="data.permissions.includes('crudRole')"
      @click="clickFeature('crudRole')"
      class="tool"
    >
      <fa icon="suitcase" />
    </div>
    <div v-if="data.permissions.includes('')" class="tool">
      <fa icon="cloud" />
    </div>
    <div v-if="data.permissions.includes('mailList')" class="tool">
      <fa icon="at" />
    </div>
    <div v-if="data.permissions.includes('calendar')" class="tool">
      <fa icon="calendar" />
    </div>
  </div>

  <div id="infoUser">
    <h1>{{ loggedUser.first_name }} {{ loggedUser.last_name }}</h1>
    <h2 v-for="role in loggedUser.roles" :key="role">{{ role }}</h2>
  </div>

  <div id="dashBody">
    <div class="dahsboardTool" id="defaultDisplay" v-if="feature == ''">
      <h2>Bonjour</h2>
      <br />
      <p>Bienvenue dans votre tableau de bord personnel</p>
      <br />
      <p>
        Cliquez sur une des icones sur votre gauche afin d'ouvrir les outils de
        gestions disponible à vos postes
      </p>
    </div>
    <CrudUser v-if="feature == 'adduser'" />
    <CrudRole v-if="feature == 'crudRole'" />
  </div>

  <FooterHorus />
</template>

<script setup >
// eslint-disable-next-line
import NavBar from "@/components/NavBar.vue";
// eslint-disable-next-line
import FooterHorus from "@/components/FooterHorus.vue";
import User from "../model/user";
import { onMounted, reactive } from "vue";
import { axiosApi } from "@/api/axios.js";
import router from "@/router";
import { ref } from "vue";
import CrudUser from "../components/dashboard/CrudUser.vue";
import CrudRole from "../components/dashboard/CrudRole.vue";

const feature = ref("");

const loggedUser = new User();

const data = reactive({
  permissions: [],
});

function clickFeature(f) {
  feature.value = f;
}

onMounted(() => {
  getPermissions();
});

function getAllRoles() {
  axiosApi
    .get("api/role/getAll")
    .then(function (response) {
      //Perform Success Action
      console.log(response.data);
      data.roles = response.data;
    })
    .catch(function (error) {
      // error.response.status Check status code
      console.log(error);
    })
    .finally(() => {
      //Perform action in alway
    });
}

function getPermissions() {
  data.permissions = [];
  loggedUser.roles.forEach((role) => {
    axiosApi
      .get("api/role/getPermissions?roleName=" + role)
      .then(function (response) {
        console.log(response.data);
        //Perform Success Action

        response.data.forEach((permission) => {
          data.permissions.push(permission);
        });

        console.log("Permissions");
        console.log(data.permissions);
      })
      .catch(function (error) {
        // error.response.status Check status code
        console.log(error);
      })
      .finally(() => {
        //Perform action in alway
      });
  });
}
</script>

<style>
#dashBody {
}

#tools {
  margin-left: 20px;
  position: fixed;
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 3%;
  top: 50%;
}

.tool {
  border-radius: 5%;
  width: 60px;
  height: 60px;
  background-color: rgb(53, 166, 31);
  margin: 3px;
  display: flex;
  justify-content: center;
  align-items: center;
}

.tool:hover {
  border: 2px solid rgb(0, 0, 0);
}

.tool * {
  width: 80%;
  height: 80%;
  color: rgb(92, 200, 68);
}

#infoUser {
  margin-bottom: 100px;
  height: 200p;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.dahsboardTool {
  margin: 0px 10px 0px 100px;
}

#defaultDisplay {
  height: 500px;
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  align-items: center;
}
</style>


