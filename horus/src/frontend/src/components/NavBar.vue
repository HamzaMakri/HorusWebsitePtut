<template>
  <header>
    <div class="container-fluid">
      <div class="row">
        <div class="col-3" id="leftNav">
          <a class="navbar-brand" th:href="@{/}" href="#"
            ><img
              id="logo"
              src="../assets/images/header/logo_rectangle.png"
              alt="logo.png"
          /></a>
        </div>
        <div class="col-9" id="rightNav">
          <nav
            class="navbar navbar-expand-lg navbar-light row"
            id="lien_top_right"
          >
            <button
              class="navbar-toggler"
              type="button"
              data-toggle="collapse"
              data-target="#navbarContent"
            >
              <span class="navbar-toggler-icon"></span>
            </button>
            <div id="navbarContent" class="collapse navbar-collapse row">
              <div class="col-12">
                <ul class="navbar-nav mr-auto justify-content-around">
                  <li class="nav-item active">
                    <a id="Accueil" class="nav-link" href="index">Accueil</a>
                  </li>
                  <li class="nav-item active">
                    <a id="Présentation" class="nav-link" href="presentation"
                      >Qui sommes-nous</a
                    >
                  </li>
                  <li class="nav-item active">
                    <a id="Solutions" class="nav-link" href="solutions"
                      >Nos solutions</a
                    >
                  </li>
                  <li class="nav-item active">
                    <a id="Contact" class="nav-link" href="contact"
                      >Nous contacter</a
                    >
                  </li>

                  <li>
                    <div
                      v-if="!data.localStorage"
                      class="col-12 col-sm-1"
                      id="login"
                    >
                      <!-- Button trigger modal -->
                      <button
                        type="button"
                        class="btn btn-primary"
                        data-bs-toggle="modal"
                        data-bs-target="#exampleModal"
                      >
                        <fa icon="arrow-right-to-bracket" />
                      </button>

                      <!-- Modal -->
                      <div
                        class="modal fade"
                        id="exampleModal"
                        tabindex="-1"
                        aria-labelledby="exampleModalLabel"
                        aria-hidden="true"
                      >
                        <div class="modal-dialog">
                          <div class="modal-content">
                            <form
                              v-on:submit.prevent="checkLogin"
                              method="post"
                            >
                              <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">
                                  Connexion
                                </h5>
                                <button
                                  type="button"
                                  class="btn-close"
                                  data-bs-dismiss="modal"
                                  aria-label="Fermer"
                                ></button>
                              </div>
                              <div class="modal-body">
                                <div class="container">
                                  <div class="loginFields">
                                    <label for="uname"><b>Email</b></label>
                                    <input
                                      v-model="form.email"
                                      type="text"
                                      placeholder="Entrez votre mail"
                                      name="uname"
                                      required
                                    />
                                  </div>
                                  <div class="loginFields">
                                    <label for="psw"><b>Mot de passe</b></label>
                                    <input
                                      v-model="form.password"
                                      type="password"
                                      placeholder="Mot de passe"
                                      name="psw"
                                      required
                                    />
                                  </div>
                                  <div class="errorField">
                                    <p
                                      id="invalidLogs"
                                      style="visibility: hidden; color: red"
                                    >
                                      Email ou mot de passe incorrect
                                    </p>
                                  </div>
                                </div>
                              </div>
                              <div class="modal-footer">
                                <button
                                  type="button"
                                  class="btn btn-secondary"
                                  data-bs-dismiss="modal"
                                >
                                  Close
                                </button>
                                <button type="submit" class="btn btn-primary">
                                  Login
                                </button>
                              </div>
                            </form>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div v-else>
                      <button
                        type="button"
                        class="btn btn-danger"
                        @click="logout()"
                      >
                        <fa icon="door-open" />
                      </button>
                    </div>
                  </li>
                </ul>
              </div>
            </div>
          </nav>
        </div>
      </div>
    </div>
  </header>
</template>

<script setup>
import { axiosApi } from "@/api/axios.js";
import router from "@/router";
import { onMounted, reactive } from "vue";
import User from "../model/user";

const data = reactive({
  localStorage: [],
});

onMounted(() => {
  data.localStorage = localStorage.getItem("user");
  console.log(data.localStorage);
});

let form = {
  email: "",
  password: "",
};

function logout() {
  localStorage.clear();
  router.push({ name: "home" });
}

/*
let form1 = {
  first_name: "Root",
  last_name: "Rott",
  email: "root@mail.com",
  password: "root",
}


function submitForm() {
  axiosApi
    .post("/addUser", this.form1)
    .then(function (response) {
      //Perform Success Action
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
*/

function checkLogin() {
  console.log("pipo");
  axiosApi
    .post("/api/auth/signin", form)
    .then(function (response) {
      console.log(response.data);
      //Perform Success Action
      router.push({ name: "dash_home" });
      document.getElementsByClassName("modal-backdrop fade show")[0].remove();
      localStorage.setItem("user", JSON.stringify(response.data));
    })
    .catch(function (error) {
      // error.response.status Check status code
      console.log(error);
      document.getElementById("invalidLogs").style.visibility = "visible";
    })
    .finally(() => {
      //Perform action in alway
    });
}

/*
export default {
  name: "NavBar",
  props: {
    msg: String,
  },
  data() {
    return {
      form1: {
        first_name: "Fred",
        last_name: "Flintstone",
        email: "Fred@outlook.com",
        password: "Flintstone123",
      },
      form: {
        email: "",
        password: "",
      },
    };
  },
  methods: {
    submitForm() {
      axiosApi
        .post("/addUser", this.form1)
        .then(function (response) {
          //Perform Success Action
          console.log(response);
        })
        .catch(function (error) {
          // error.response.status Check status code
          console.log(error);
        })
        .finally(() => {
          //Perform action in always
        });
    },
    checkLogin() {
      axiosApi
        .post("/checkLogin", this.form)
        .then(function (response) { 
          console.log(response.data);
          //Perform Success Action
          router.push({name : 'dash_home'})
          document.getElementsByClassName('modal-backdrop fade show')[0].remove()

        })
        .catch(function (error) {
          // error.response.status Check status code
          console.log(error);
          document.getElementById("invalidLogs").style.visibility = "visible";
        })
        .finally(() => {
          //Perform action in alway
        });
    },
  },
};
*/
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#rightNav {
  text-align: center;
}

nav {
  display: flex;
  flex-direction: row;
  justify-content: end;
}
</style>
