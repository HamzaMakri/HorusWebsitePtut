<template>
    <NavBar/>
    <body>
        <h2>Qui sommes-nous? </h2>

        <!--<img class= "wepha" src="..\assets\wepha_pic.png" alt="noimage"/> -->
        
        <!-- on a une liste des poles
             chaque pole a une liste de roles 
             chaque role a une liste de user --> 
        <div id="text1">
            <p>
            Voici les bénévoles travaillant dur quotidiennement afin de faire en sorte que tout roule comme sur des roulettes au sein de la Junior Entreprise!🤗
            </p> 
        </div>

        <div class="poles" v-for ="pole in data.poles" :key="pole">
            <h2 class="titrePoles"> {{ pole.name }} </h2>

            <div v-for ="role in pole.roles" :key="role">
                <h3> {{ role.name }} </h3>

                <div v-for ="user in role.users" :key="user">
                    <img class= "icone" src="..\assets\icone_pic.png" alt="noimage"/>
                    <p> {{user.first_name}} {{user.last_name}} </p>
                </div>
            </div>
        </div> 
        

                        
            

    </body>
    <FooterHorus/>

</template>

<script setup>
import FooterHorus from '@/components/FooterHorus.vue';
import NavBar from '@/components/NavBar.vue';
import {onMounted, reactive} from "vue";
import { axiosApi} from "@/api/axios.js";



const data =reactive({
    poles:[],

})

onMounted(() => {
    getAllPoles()
    setTimeout(() => {
    console.log(data.poles);
  }, 1000);
});

function getAllPoles(){
    // appel d'api
    axiosApi
    .get("api/pole/getAll")
    .then(function (response) {
      //console.log(response.data);
      //Perform Success Action
      console.log(response.data);
      data.poles = response.data;
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


<style scoped>

    footer{
        margin-top:100px;
    }
    h2 {

        font-family:Calibri;
        color:DarkCyan;
        font-weight: oblique;
        font-size:35px;
        font-weight:bold;
        margin-bottom:40px;
        margin-top:0px;
        margin-left:500px;

    }
    

    .wepha{
        width:1260px;
        height : 260px;
        margin-bottom:18px;
    }

    #text1{
      margin-top:1px;  
      text-align: center;
      margin-bottom:50px;
      font-size:15px;
      font-weight:normal;
    }
    










    /*#bloc1
    {

        background-color:#F8F8FF;
        height:150px;
        background-image: url('../assets/president_pic.png');
        background-repeat: no-repeat;
        background-attachment: fixed;
        background-position: center;
        background-size: 5%;
        margin-top:1px;  
        text-align: center;
        font-size:15px;
        font-weight:bold;
        overflow:hidden;
    }
    #nom1{
        margin-top:75px;
        font-size:14px;
        font-weight:normal;
    }*/

    
   
   




</style>