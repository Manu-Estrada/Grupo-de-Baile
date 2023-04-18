import QuienesSomosPublicRepository from "./xareuApi/QuienesSomosPublicRepository";
import EventosPublicRepository from "./xareuApi/EventosPublicRepository";
import ContactoPublicRepository from "./xareuApi/ContactoPublicRepository";

export default class ApiRepository {

    api;

    constructor(apiToCharge) {
        this.api = apiToCharge
        this.chooseApi()
    }

    chooseApi() {
        if(this.api === "quienesSomos") return new QuienesSomosPublicRepository;
        if(this.api === "eventos") return new EventosPublicRepository;
        if(this.api === "sendemail") return new ContactoPublicRepository;
        
    }
}