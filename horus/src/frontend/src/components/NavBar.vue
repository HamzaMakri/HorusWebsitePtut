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
                    <div class="col-12 col-sm-1" id="login">
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
                            <form action="/dashboard" method="post">
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
                        type="text"
                        placeholder="Entrez votre mail"
                        name="uname"
                        required
                      />
                    </div>
                                <div class="loginFields">
                                  <label for="psw"><b>Mot de passe</b></label>
                                  <input
                                    type="password"
                                    placeholder="Mot de passe"
                                    name="psw"
                                    required
                                  />
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

<script>
export default {
  name: "HelloWorld",
  props: {
    msg: String,
  },
};
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
