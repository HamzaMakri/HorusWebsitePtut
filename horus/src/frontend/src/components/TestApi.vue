<template>
  <div>
    <button @click="blabla" type="button" class="btn btn-success">
      test du get du user
    </button>
    <button @click="callApi" type="button" class="btn btn-success">
      OUAIS OUAIS OeeUAIS APPEL API
    </button>
    <h2>Message : {{ message }}</h2>
  </div>
</template>


<script setup>
import { axiosApi } from "@/api/axios.js";
import { ref } from "vue";

let message = ref("");

function blabla() {
  console.log("pipiperfn");
  axiosApi
    .post(`/checkLogin`)
    .then((response) => {
      message.value = response.data;
    })
    .catch((e) => {
      this.errors.push(e);
    });
}

function callApi() {
  axiosApi
    .get(`getAll`)
    .then((response) => {
      message.value = response.data;
    })
    .catch((e) => {
      this.errors.push(e);
    });
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
