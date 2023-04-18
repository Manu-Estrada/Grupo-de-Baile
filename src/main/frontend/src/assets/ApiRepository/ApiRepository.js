import QuienesSomosPublicRepository from "./xareuApi/QuienesSomosPublicRepository";
import EventosPublicRepository from "./xareuApi/EventosPublicRepository";
import SobreNosotrosPublicRepository from "./xareuApi/SobreNosotrosPublicRepository";


export default class ApiRepository {

    api;

    constructor(apiToCharge) {
        this.api = apiToCharge
        this.chooseApi()
    }

    chooseApi() {
        if(this.api === "quienesSomos") return new QuienesSomosPublicRepository;
        if(this.api === "eventos") return new EventosPublicRepository;
        if(this.api === "sobreNosotros") return new SobreNosotrosPublicRepository;
        
    }
}