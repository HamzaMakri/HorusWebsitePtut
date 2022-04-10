<template>
  <div id="crudUser" class="dahsboardTool">
    <div id="create">
      <h3>Créer un nouvel utilisateur</h3>

      <div id="labelsCreate" class="labels">
        <div class="">
          <div>
            <label for="first_name">Prenom : </label>
            <input id="first_name" type="text" v-model="newUser.first_name" />
          </div>

          <div>
            <label for="last_name_create">Nom : </label>
            <input
              id="last_name_create"
              type="text"
              v-model="newUser.last_name"
            />
          </div>
        </div>

        <div class="">
          <div>
            <label for="email_create">Email : </label>
            <input id="email_create" type="text" v-model="newUser.email" />
          </div>

          <div>
            <label for="password_create">Mot de passe : </label>
            <input
              id="password_create"
              type="text"
              v-model="newUser.password"
            />
          </div>
        </div>
      </div>

      <div id="checkboxesCreate">
        <h5>Rôles :</h5>
      </div>

      <button @click="createNewUser()">Créer le compte</button>
    </div>

    <div id="update">
      <h3>Modifier l'utilisateur</h3>
<p id="user_id"></p>
      <div id="labelsUpdate" class="labels">
        <div class="">
          <div>
            <label for="first_name_update">Prenom : </label>
            <input
              id="first_name_update"
              type="text"
              v-model="userUpdated.first_name"
            />
          </div>

          <div>
            <label for="last_name_update">Nom : </label>
            <input
              id="last_name_update"
              type="text"
              v-model="userUpdated.last_name"
            />
          </div>
        </div>

        <div class="">
          <div>
            <label for="email_update">Email : </label>
            <input id="email_update" type="text" v-model="userUpdated.email" />
          </div>

          <div>
            <label for="password_update">Mot de passe : </label>
            <input
              id="password_update"
              type="text"
              v-model="userUpdated.password"
            />
          </div>
        </div>
      </div>

      <div id="checkboxesUpdate">
        <h5>Rôles :</h5>
      </div>

      <button @click="updateUser()">Modifier</button>
    </div>

    <div id="table">
      <h3>Liste des utilisateurs</h3>
      <table class="table table-bordered table-sm table-hover">
        <thead>
          <tr>
            <th>Nom</th>
            <th>Prenom</th>
            <th>Mail</th>
            <th>Photo de Profil</th>
            <th>Roles</th>
            <th>Action</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="user in data.users" :key="user">
            <td>{{ user.first_name }}</td>
            <td>{{ user.last_name }}</td>
            <td>{{ user.email }}</td>
            <td>{{ user.avatar_path }}</td>
            <td>
              <p v-for="role in user.roles" :key="role">
                {{
                  role.name +
                  (user.roles.indexOf(role) < user.roles.length ? "" : "/")
                }}
              </p>
            </td>
            <td>
              <button
                class="btn btn-sm btn-outline-danger"
                @click="deleteUser(user)"
              >
                Supprimer
              </button>
              <button
                class="btn btn-sm btn-outline-danger"
                @click="initializeUpdate(user)"
              >
                Modifier
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

let newUser = ref({
  first_name: "",
  last_name: "",
  email: "",
  password: "",
  roles: [],
});

let userUpdated = ref({
  first_name: "",
  last_name: "",
  email: "",
  password: "",
  roles: [],
});

// A MODIFIER (recurperer le user du parent)
const loggedUser = new User();

onMounted(() => {
  getAllUsers();
  getAllRoles();
});

function getAllUsers() {
  axiosApi
    .get("api/user/getAll")
    .then(function (response) {
      //Perform Success Action
      console.log(response.data);
      data.users = response.data;
    })
    .catch(function (error) {
      // error.response.status Check status code
      console.log(error);
    })
    .finally(() => {
      //Perform action in alway
    });
}

function createNewUser() {
  let boxes = document.getElementsByClassName("boxes");

  for (var i = 0; i < boxes.length; i++) {
    if (boxes[i].checked) {
      newUser.value.roles.push(boxes[i].value);
    }
  }

  console.log(newUser.value);

  axiosApi
    .post("/api/auth/signup", newUser.value , {
      headers: {
        baseURL: `http://localhost:8080`,
        Authorization: loggedUser.tokenType + " " + loggedUser.accessToken,
      },
    })
    .then(function (response) {
      //Perform Success Action
      getAllUsers();
      console.log(response);
    })
    .catch(function (error) {
      // error.response.status Check status code
      console.log(error);
    })
    .finally(() => {
      //Perform action in always
    });
}

function deleteUser(user) {
  axiosApi
    .delete("api/user/delete/" + user.user_id,  {
      headers: {
        baseURL: `http://localhost:8080`,
        Authorization: loggedUser.tokenType + " " + loggedUser.accessToken,
      },
    })
    .then((response) => {
      data.users.splice(user.user_id, 1);
      console.log(this.result);
      getAllUsers();
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


function updateUser() {

  let userId = document.getElementById('user_id').innerHTML;
  console.log(userId);
  console.log('=============');
  console.log(userUpdated.value);

  axiosApi
    .put("api/user/update/" + userId , userUpdated.value, {
      headers: {
        baseURL: `http://localhost:8080`,
        Authorization: loggedUser.tokenType + " " + loggedUser.accessToken,
      },
    })
    .then(function (response) {
      //Perform Success Action
      console.log(response.data);
      data.roles = response.data;
      data.roles.forEach((role) => {
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

function initializeUpdate(user) {
  document.getElementById("first_name_update").value = user.first_name ;
  document.getElementById("last_name_update").value = user.last_name ;
  document.getElementById("email_update").value = user.email ;
  document.getElementById("user_id").innerHTML = user.user_id ;
  userUpdated.value = user;
  console.log('BABABABABBABABABAB');
  console.log(user);
  console.log(userUpdated.value);
}
</script>

<style>


input{
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

#update{
  background-color: rgb(84, 178, 175);
  padding: 30px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

.labels{
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

.labels label{
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