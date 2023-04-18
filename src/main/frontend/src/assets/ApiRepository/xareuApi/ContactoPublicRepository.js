export default class ContactoPublicRepository {
  url = "http://localhost:8080/api/sendemail";

  constructor() {}

  async getAll() {
    const response = await fetch(this.url);
    const json = await response.json();

    let contactoList = [];

    contactoList.push(json);

    return json;
  }
}
