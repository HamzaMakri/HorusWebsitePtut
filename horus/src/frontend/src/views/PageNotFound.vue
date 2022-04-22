<template>

  <div >
    <h1>404 - Page Not Found</h1>
    <p>Oupsie doopsie, cette page n'existe pas ou plus.</p>
    <p>Retour à la <a href="/">page d'accueil</a></p>

  </div>

</template>


<script>

export default {
    methods: {
    },
    name: 'PageNotFound',

}
</script>

<style scoped>

div {
display: flex;
flex-direction: column;
justify-content: center;
align-content: center;
text-align: center;
min-height: 100vh;

}

</style>