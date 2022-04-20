<template>




  <head>
      <title>Horus HealthCare Systems: Accueil</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0 shrink-to-fit=no" />
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

      <link rel="shortcut icon" href="../images/header/logo_carre.png" />
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous" />
  </head>

  
  <router-view  />

    
    
</template>

<script>


export default {
    methods: {
    },
    name: 'App',

}

</script>

<!--
<script src="../js/index.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
    integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
    crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
    integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
    crossorigin="anonymous"></script>
-->




<style>
/*
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/
/* 
    Created on : 29 avr. 2021, 21:27:35
    Author     : Tristan
*/

/*Header*/

a {
    font-size: 20px;
    transition: all 0.5s ease-out;
}

#a:hover,
#a:focus {
    color: rgb(85, 177, 173);
}

a:link 
{ 
 text-decoration:none; 
} 



#Accueil {
    color: rgb(85, 177, 173);
}


/*Main*/

#bandeau_anniversaire {
    height: 120px;
    background-color: rgb(85, 177, 173);
    display: flex;
    justify-content: space-around;
    align-items: center;
}

#texte_anniversaire {
    color: white;
    font-size: 30px;
}


#presentation_JE {
    animation-name: transition;
    animation-duration: 1000ms;
    animation-timing-function: ease-in-out;
    animation-iteration-count: 1;
}

#centrage_logo {
    height: 400px;
    justify-content: center;
    align-content: flex-end;
}

#logo_central {
    width: 354px;
    height: 348px;
}

#bord_ellipse1 {
    position: absolute;
    width: 354px;
    height: 348px;
    border: solid rgba(177, 177, 177, 1) 0.1px;
    border-radius: 300px;
    background-color: rgba(177, 177, 177, 1);
}

#bord_inter_ellipse {
    position: absolute;
    top: 10%;
    left: 10%;
    width: 278px;
    height: 278px;
    border: solid rgba(177, 177, 177, 1) 0.1px;
    border-radius: 300px;
    background-color: rgba(207, 207, 206, 1);
}

#bord_ellipse2 {
    position: absolute;
    top: 14%;
    left: 13%;
    width: 200px;
    height: 200px;
    border: solid rgba(207, 207, 206, 1) 0.1px;
    border-radius: 300px;
    background-color: white;
}

#logo_final {
    position: absolute;
    top: 15%;
    left: 15%;
}

#titre_sous_logo {
    color: rgb(85, 177, 173);
    margin: 0 auto;
    justify-content: center;
}

#description {
    font-size: 22px;
    text-align: center;
    margin-left: 15%;
    margin-right: 15%;
}

#horus_chiffres {
    background-color: rgb(85, 177, 173);
}

#titre_hc {
    position: relative;
    color: white;
    margin: 0 auto;
    justify-content: center;
    text-align: center;
    font-weight: 100;
}

#ligne_blanche_hc {
    background-color: white;
    position: relative;
    width: 80%;
    left: 10%;
    border: solid white 2px;
    border-radius: 2px;
}

#stats {
    justify-content: space-around;
    display: flex;
    margin-bottom: 40px;
}

/*
Animation ciffres
*/

@keyframes transition {
    0% {
        transform: translateY(10vh);
        opacity: 0;
    }

    100% {
        transform: translateY(0px);
        opacity: 1;
    }
}

.statistiques {
    position: relative;
    height: 250px;
    max-width: 250px;
    border: solid white 0.1px;
    border-radius: 300px;
    background-color: white;
    margin-bottom: 20px;
}

.nombre {
    color: rgb(85, 177, 173);

    font-size: 7em;
    font-weight: 500;
}

.contenu {
    position: relative;
    bottom: 5px;
    color: rgb(85, 177, 173);
    font-size: 1.3em;
}

#premier {
    color: rgb(85, 177, 173);
    position: relative;
    bottom: 200px;
    left: 40px;
    font-size: 2em;
}

#ligne_bleue_semantique {
    background-color: rgb(85, 177, 173);
    position: relative;
    width: 80%;
    left: 10%;
    border: solid rgb(85, 177, 173) 2px;
    border-radius: 2px;
}

.carousel-item.active {
    height: 250px;
}

.carousel-indicators {
    top: 220px;
}

.fleche_prev {
    border-right: 10px solid;
    border-bottom: 10px solid;
    height: 30px;
    width: 30px;
    transform: rotate(135deg);
    color: rgb(85, 177, 173);
}

.fleche_next {
    border-right: 10px solid;
    border-bottom: 10px solid;
    height: 30px;
    width: 30px;
    transform: rotate(-45deg);
    color: rgb(85, 177, 173);
}

.lien.active {
    background-color: rgb(85, 177, 173);
}

#ligne_blanche_contact {
    background-color: white;
    position: relative;
    width: 80%;
    left: 10%;
    border: solid white 2px;
    border-radius: 2px;
}

#ligne_blanche_navigation {
    background-color: white;
    position: relative;
    width: 80%;
    left: 10%;
    border: solid white 2px;
    border-radius: 2px;
}

.nomPartenaires {
    color: rgb(85, 177, 173);
    text-decoration: none;
}


.image_petale {
    margin-bottom: 20px;
}

#semantique_logo {
    color: rgb(85, 177, 173);
    margin: 0 auto;
    justify-content: center;
}

#espace_symbole {
    display: flex;
    justify-content: space-around;
}

.col-12.col-sm-4.text-center.petale {
    max-width: 371px;
}

p {
    font-size: 1.2em;
}

footer {
    background-color: rgb(85, 177, 173);
    display: flex;
    justify-content: space-around;
    align-content: center;
}

.footer_links {
    color: rgb(147, 149, 154);
}

.footer_text {
    color: rgb(147, 149, 154);
    font-size: 20px;
}

.footer_links:hover {
    text-decoration: none;
    color: rgb(147, 149, 154);
}

@media screen and (max-width: 322px) {
    #logo_central {
        left: 3%;
        width: 300px;
    }

    #bord_ellipse1 {
        position: absolute;
        width: 300px;
        height: 295px;
        border: solid rgba(177, 177, 177, 1) 0.1px;
        border-radius: 300px;
        background-color: rgba(177, 177, 177, 1);
    }

    #bord_inter_ellipse {
        position: absolute;
        top: 10%;
        left: 10%;
        width: 240px;
        height: 238px;
        border: solid rgba(177, 177, 177, 1) 0.1px;
        border-radius: 300px;
        background-color: rgba(207, 207, 206, 1);
    }

    #bord_ellipse2 {
        position: absolute;
        top: 14%;
        left: 13%;
        width: 175px;
        height: 172px;
        border: solid rgba(207, 207, 206, 1) 0.1px;
        border-radius: 300px;
        background-color: white;
    }

    #logo_final {
        position: absolute;
        top: 3%;
        left: 10%;
    }
}

@media screen and (max-width: 380px) {
    #horus_chiffres {
        height: 1100px;
    }
}

@media screen and (min-width:380px) and (max-width: 570px) {
    #horus_chiffres {
        height: 750px;
    }
}



</style>
