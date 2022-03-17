<template>
  <div class="container-fluid">
      <h2>Un panel de partenaires</h2>
    <br />
    <div id="ligne_bleue_semantique"></div>
    <br /><br />
    <div id="demo" class="carousel slide" data-ride="carousel">
      <ul class="carousel-indicators">
        <li data-target="#demo" data-slide-to="0" class="lien active"></li>
        <li data-target="#demo" data-slide-to="1" class="lien"></li>
        <li data-target="#demo" data-slide-to="2" class="lien"></li>
        <li data-target="#demo" data-slide-to="3" class="lien"></li>
        <li data-target="#demo" data-slide-to="4" class="lien"></li>
        <li data-target="#demo" data-slide-to="5" class="lien"></li>
        <li data-target="#demo" data-slide-to="6" class="lien"></li>
        <li data-target="#demo" data-slide-to="7" class="lien"></li>
        <li data-target="#demo" data-slide-to="8" class="lien"></li>
        <li data-target="#demo" data-slide-to="9" class="lien"></li>
      </ul>
      <div class="carousel-inner">
        <div class="carousel-item active">
          <a href="https://isis.univ-jfc.fr">
            <img
              src="../assets/images/partenaires/logo_ISIS.png"
              alt="Carrousel slide 1"
              class="mx-auto d-block"
            />
            <div class="carousel-caption d-none d-md-block">
              <h4 class="nomPartenaires">ÉCOLE D'INGÉNIEURS ISIS</h4>
            </div>
          </a>
        </div>
      </div>
      <div class="carousel-item">
        <a href="https://www.groupe-insa.fr">
          <img
            src="../assets/images/partenaires/insa.jpg"
            alt="Carrousel slide 2"
            class="mx-auto d-block"
          />
          <div class="carousel-caption d-none d-md-block">
            <h4 class="nomPartenaires">GROUPE INSA</h4>
          </div>
        </a>
      </div>
    </div>
    <div class="carousel-item">
      <a href="https://junior-entreprises.com">
        <img
          src="../assets/images/partenaires/CNJE.png"
          alt="Carrousel slide 3"
          class="mx-auto d-block"
        />
        <div class="carousel-caption d-none d-md-block">
          <h4 class="nomPartenaires">CNJE</h4>
        </div>
      </a>
    </div>

    <div class="carousel-item">
      <a href="https://www.alten.fr">
        <img
          src="../assets/images/partenaires/alten.png"
          alt="Carrousel slide 4"
          class="mx-auto d-block"
        />
        <div class="carousel-caption d-none d-md-block">
          <h4 class="nomPartenaires">ALTEN FRANCE</h4>
        </div>
      </a>
    </div>

    <div class="carousel-item">
      <a href="https://mabanque.bnpparibas">
        <img
          src="../assets/images/partenaires/bnp.png"
          alt="Carrousel slide 5"
          class="mx-auto d-block"
        />
        <div class="carousel-caption d-none d-md-block">
          <h4 class="nomPartenaires">BNP PARIBAS</h4>
        </div>
      </a>
    </div>
    <div class="carousel-item">
      <a href="https://www.my-business-plan.fr">
        <img
          src="../assets/images/partenaires/business-plan.png"
          alt="Carrousel slide 6"
          class="mx-auto d-block"
        />
        <div class="carousel-caption d-none d-md-block">
          <h4 class="nomPartenaires">MY BUSINESS PLAN</h4>
        </div>
      </a>
    </div>
    <div class="carousel-item">
      <a href="https://www.engie.com">
        <img
          src="../assets/images/partenaires/engie.png"
          alt="Carrousel slide 7"
          class="mx-auto d-block"
        />
        <div class="carousel-caption d-none d-md-block">
          <h4 class="nomPartenaires">ENGIE</h4>
        </div>
      </a>
    </div>
    <div class="carousel-item">
      <a href="https://www.ey.com/fr_fr">
        <img
          src="../assets/images/partenaires/ey.png"
          alt="Carrousel slide 8"
          class="mx-auto d-block"
        />
        <div class="carousel-caption d-none d-md-block">
          <h4 class="nomPartenaires">EY</h4>
        </div>
      </a>
    </div>
    <div class="carousel-item">
      <img
        src="../assets/images/partenaires/bde.png"
        alt="Carrousel slide 9"
        class="mx-auto d-block"
      />
      <div class="carousel-caption d-none d-md-block">
        <h4 class="nomPartenaires">BUREAU DES ÉTUDIANTS OSIRIS</h4>
      </div>
    </div>
    <div class="carousel-item">
      <img
        src="../assets/images/partenaires/mic.jpg"
        alt="Carrousel slide 10"
        class="mx-auto d-block"
      />
      <div class="carousel-caption d-none d-md-block">
        <h4 class="nomPartenaires">MUSIC ISIS CLUB</h4>
      </div>
    </div>
    <!--
    <a
      class="carousel-control-prev"
      href="#demo"
      role="button"
      data-slide="prev"
    >
      <div class="fleche_prev"></div>
      <span class="sr-only">Précédent</span>
    </a>
    <a
      class="carousel-control-next"
      href="#demo"
      role="button"
      data-slide="next"
    >
      <div class="fleche_next"></div>
      <span class="sr-only">Suivant</span>
    </a>
    -->
  </div>
</template>

<script>
export default {
  name: "PartenerShipComponent",
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
