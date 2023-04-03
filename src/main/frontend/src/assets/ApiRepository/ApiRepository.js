import QuienesSomosPublicRepository from "./xareuApi/QuienesSomosPublicRepository";


export default class ApiRepository {

    api;

    constructor(apiToCharge) {
        this.api = apiToCharge
        this.chooseApi()
    }

    chooseApi() {
        if(this.api === "quienesSomos") return new QuienesSomosPublicRepository;
    
    }
}