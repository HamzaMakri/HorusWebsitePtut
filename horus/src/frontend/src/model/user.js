export default class User {
    constructor() {
        let localUser = JSON.parse(localStorage.getItem("user"));
        console.log(localUser.accessToken);

        this.first_name = localUser.first_name;

        this.last_name = localUser.last_name;

        this.email = localUser.email;

        this.roles = localUser.roles;

        this.accessToken = localUser.accessToken;

        this.tokenType = localUser.tokenType;
    }

    set first_name(fn){
        this._first_name = fn
    }

    set last_name(lm){
        this._last_name = lm
    }

    set email(e){
        this._email = e
    }

    set roles(r){
        this._roles = r
    }

    set accessToken(at){
        this._accessToken = at
    }

    set tokenType(tt){
        this._tokenType = tt
    }

    get first_name() {
        return this._first_name;
    }

    get last_name() {
        return this._last_name;
    }

    get email() {
        return this._email;
    }

    get roles() {
        return this._roles;
    }

    get accessToken() {
        return this._accessToken;
    }

    get tokenType() {
        return this._tokenType;
    }

}
