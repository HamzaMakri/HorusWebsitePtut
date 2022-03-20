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


  <router-view />
  
    <NavBar/>

    <Presentation/>

    <FewNumbers/>

    <PartenerShipComponent/>

    <FooterHorus/>
    
    <CarouselPartnership/>
    
    
</template>

<script>
import PartenerShipComponent from '@/components/PartenerShipComponent.vue'
import FooterHorus from '@/components/FooterHorus.vue'
import FewNumbers from '@/components/FewNumbers.vue'
import Presentation from '@/components/PresentationWidget.vue'
import NavBar from '@/components/NavBar.vue'
// eslint-disable-next-line
import Vue from 'vue'


export default {
    methods: {
    },
    name: 'HomePage',
    components: {
    PartenerShipComponent,
    FooterHorus,
    FewNumbers,
    Presentation,
    NavBar
    }
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



