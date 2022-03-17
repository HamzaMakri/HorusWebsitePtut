<template>
  <main>
    <div class="container-fluid">
      <div id="bandeau_anniversaire" class="row">
        <div id="espace_vide_pour_proprete" class="col-12 col-sm-1"></div>
        <div class="col-8 col-sm-5">
          <div id="texte_anniversaire">Horus fête ses 10 ans !</div>
        </div>
        <div class="col-12 col-sm-3">
          <a href="projets">
            <button id="bouton_anniversaire">Nos projets</button>
          </a>
        </div>

        <div id="espace_vide_pour_proprete" class="col-12 col-sm-2"></div>
      </div>
    </div>
    <div class="container-fluid bg-light" id="presentation_JE">
      <div id="centrage_logo" class="row">
        <div id="présentation">
          <div id="logo_central">
            <div id="bord_ellipse1">
              <div id="bord_inter_ellipse">
                <div id="bord_ellipse2">
                  <div id="logo_final">
                    <img
                      id="logo2"
                      src="../assets/images/header/logo_carre.png"
                      alt="logo.png"
                    />
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <br />
      <div id="titre_sous_logo" class="row">
        <h2>Première Junior-Initiative en e-santé</h2>
      </div>
      <br /><br />
      <div id="description">
        Horus Healthcare Systems est la Junior-Entreprise de l’école
        d’ingénieurs ISIS de Castres spécialisée dans la formation en e-santé.
        Horus s’appuie sur les étudiants de l’école compétents dans la création
        de sites web, le développement d’applications et les bases de données.
        <br /><br />
      </div>
    </div>
  </main>
</template>

<script>
export default {
  name: "HelloWorld",
  props: {
    msg: String,
  },
  methods: {
    popUpLogin() {
      var modal = document.getElementById("id01");

      // When the user clicks anywhere outside of the modal, close it
      window.onclick = function (event) {
        if (event.target == modal) {
          modal.style.display = "none";
        }
      };
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>


#bouton_anniversaire {
    height: 40px;
    width: 200px;
    background-color: rgb(85, 177, 173);
    border: solid white 2px;
    border-radius: 20px;
    color: white;
    transition: all 0.5s ease-out;
}

#bouton_anniversaire:hover,
#bouton_anniversaire:focus {
    background-color: white;
    color: rgb(85, 177, 173);
}


@media screen and (max-width: 576px) {
    #texte_anniversaire {
        font-size: 20px;
        position: relative;
        left: 30%;
        width: 210px;
    }

    #bouton_anniversaire {
        position: relative;
        left: 30%;
    }
}

@media screen and (min-width:577px) and (max-width:875px) {
    #bouton_anniversaire {
        width: 120px;
    }

    #statistique_1 {
        position: relative;
        height: 190px;
        max-width: 190px;
        border: solid white 0.1px;
        border-radius: 300px;
        background-color: white;
        margin-bottom: 20px;
    }

    .nombreAnnees {
        font-size: 4em;
        font-weight: 500;
    }

    .contenuAnciennete {
        font-size: 1.2em;
    }

    #statistique_2 {
        position: relative;
        height: 190px;
        max-width: 190px;
        border: solid white 0.1px;
        border-radius: 300px;
        background-color: white;
        margin-bottom: 20px;
    }

    #statistique_3 {
        position: relative;
        height: 190px;
        max-width: 190px;
        border: solid white 0.1px;
        border-radius: 300px;
        background-color: white;
        margin-bottom: 20px;
    }
}

.container {
  display: flex;
}

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
