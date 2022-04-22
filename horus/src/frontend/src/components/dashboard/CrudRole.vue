<template>
  <div id="crudUser" class="dahsboardTool">
    <div id="create">
      <h3>Créer un nouveau poste</h3>

      <div id="labelsCreate" class="labels">
        <div class="">
          <div>
            <label for="name">Nom du poste: </label>
            <input id="name" type="text" v-model="newRole.name" />
          </div>
        </div>
      </div>
      <button @click="createNewRole()">Ajouter le poste</button>

    </div>

    <div id="table">
      <h3>Liste des utilisateurs</h3>
      <table class="table table-bordered table-sm table-hover">
        <thead>
          <tr>
            <th>Poste</th>
            <th>Action</th>

          </tr>
        </thead>
        <tbody>
          <tr v-for="role in data.roles" :key="role">
            <td>{{ role.name }}</td>
            <td>
                <button
                class="btn btn-sm btn-outline-danger"
                @click="deleteRole(role)"
              >
                Supprimer
              </button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>



<script setup >
import User from "../../model/user";
import { onMounted, reactive } from "vue";
import { axiosApi } from "@/api/axios.js";
import router from "@/router";
import axios from "axios";
import { ref } from "vue";
import { parseStringStyle } from "@vue/shared";

const data = reactive({
  users: [],
  roles: [],
});

let newRole = ref({
  name: "",
});



// A MODIFIER (recurperer le user du parent)
const loggedUser = new User();

onMounted(() => {
  getAllRoles();
});

function deleteRole(role) {
    axiosApi
    .delete("api/role/delete/" + role.role_id, {
      headers: {
        baseURL: `http://localhost:8080`,
        Authorization: loggedUser.tokenType + " " + loggedUser.accessToken,
      },
    })
    .then((response) => {
      data.roles.splice(role.role_id, 1);
      getAllRoles();
    });
}


function createNewRole() {

console.log(newRole.value);

  axiosApi
    .post("/api/role/addRole", newRole.value, {
      headers: {
        baseURL: `http://localhost:8080`,
        Authorization: loggedUser.tokenType + " " + loggedUser.accessToken,
      },
    })
    .then(function (response) {
      //Perform Success Action
      console.log(response);
      getAllRoles()
      
    })
    .catch(function (error) {
      // error.response.status Check status code
      console.log(error);
    })
    .finally(() => {
      //Perform action in always
    });
}

function getAllRoles() {
  axiosApi
    .get("api/role/getAll")
    .then(function (response) {
      //Perform Success Action
      console.log(response.data);
      data.roles = response.data;

      data.roles.forEach((role) => {
        var checkRole = document.createElement("input");
        checkRole.type = "checkbox";
        checkRole.name = "roleChecked";
        checkRole.id = "role" + role.role_id;
        checkRole.value = role.name;
        checkRole.classList.add("boxes");

        var labelRole = document.createElement("label");
        labelRole.setAttribute("for", "role" + role.role_id);
        labelRole.innerHTML = role.name;

        var divRoles = document.createElement("div");
        divRoles.classList.add("role");
        divRoles.id = "div" + role.name;

        document.getElementById("checkboxesCreate").appendChild(divRoles);
        document.getElementById("div" + role.name).appendChild(labelRole);
        document.getElementById("div" + role.name).appendChild(checkRole);
      });
    })
    .catch(function (error) {
      // error.response.status Check status code
      console.log(error);
    })
    .finally(() => {
      //Perform action in alway
    });
}

</script>

<style>
input {
  height: fit-content;
}

#create {
  background-color: rgb(177, 213, 97);
  padding: 30px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

#update {
  background-color: rgb(84, 178, 175);
  padding: 30px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.labels {
  display: flex;
  align-content: space-around;
  justify-content: space-evenly;
  flex-wrap: wrap;
  width: 100%;
}

.labels * {
  display: flex;
  width: 100%;
  margin: 10px;
}

.labels label {
  display: inline;
  width: 20%;
}

#table {
  margin-top: 30px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

#checkboxesCreate {
  margin: 12px;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  flex-wrap: wrap;
}

.role {
  display: flex;
  justify-content: center;
  align-items: center;
}

.role * {
  margin: 10px;
}
</style>