<template>
  <div class="container-fluid">
    <div class="row">
      <div id="horus_chiffres" class="col-12">
        <div id="titre_hc">
          <h2>
            <br />
            Horus en quelques chiffres
          </h2>
        </div>
        <br />
        <div id="ligne_blanche_hc"></div>
        <br /><br />
        <div id="stats" class="row">
          <div class="col-12 col-sm-4 statistiques">
            <div class="anciennete text-center">
              <div class="nombre">10</div>
              <div class="contenu">années <br />d'expérience</div>
            </div>
          </div>
          <div class="col-12 col-sm-4 statistiques">
            <div class="anciennete text-center">
              <div class="nombre">1</div>
              <div class="contenu">Junior <br />en e-santé</div>
              <div id="premier">ère</div>
            </div>
          </div>
          <div class="col-12 col-sm-4 statistiques"></div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "FewNumbers",
  props: {
    msg: String,
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
