import { createApp } from 'vue'
import App from './App.vue'

import "bootstrap";

/* import the fontawesome core */
import { library } from '@fortawesome/fontawesome-svg-core'

/* import specific icons */
import { fas } from '@fortawesome/free-solid-svg-icons'

/* import font awesome icon component */
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'

/* add icons to the library */
library.add(fas)

import router from './router'


createApp(App)
    .component('fa', FontAwesomeIcon)
    .use(router)
    .mount('#app')

