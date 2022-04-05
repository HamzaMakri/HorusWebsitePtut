<template>
  <div id="crudUser" class="dahsboardTool">
    <table class="table table-bordered table-sm table-hover">
      <thead>
        <tr>
          <th>Nom</th>
          <th>Prenom</th>
          <th>Mail</th>
          <th>Photo de Profil</th>
          <th></th>
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
            <button
              class="btn btn-sm btn-outline-danger"
              @click="deleteUser(user)"
            >
              Supprimer
            </button>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
</template>



<script setup>
import User from "../../model/user";
import { onMounted, reactive } from "vue";
import { axiosApi } from "@/api/axios.js";
import router from "@/router";
import { ref } from "vue";
import axios from "axios";

const data = reactive({
  users: [],
});

// A MODIFIER (recurperer le user du parent)
const loggedUser = new User();


onMounted(() => {
  getAllUsers();
  setTimeout(() => {
    console.log(data.users);
  }, 100);

  data.users.forEach((user) => {
    console.log(data.users.at(3));
  });
});

function getAllUsers() {
  axiosApi
    .get("api/user/getAll")
    .then(function (response) {
      //console.log(response.data);
      //Perform Success Action
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

function deleteUser(user) {
    
    axiosApi.delete("api/user/delete/" + user.user_id, {
    headers: {
        baseURL: `http://localhost:8080`,
        Authorization: loggedUser.tokenType + " " + loggedUser.accessToken,
    }
    }).then((response) => {
        data.users.splice(user.user_id, 1);
        console.log(this.result);
        getAllUsers();
    });



}
</script>

<style>
</style>