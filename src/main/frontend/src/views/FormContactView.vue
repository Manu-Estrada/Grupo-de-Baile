<script setup>
import ContactForm from '../components/contactForm/contactForm.vue';
import ApiRepository from "./../assets/ApiRepository/ApiRepository.js";
import { onBeforeMount, ref } from "vue";


const repository = new ApiRepository("sendemail");
const api = repository.chooseApi();

let contactList = ref([]);
onBeforeMount(async () => {
  contactList.value = await api.getAll();
});

</script>

<template>
  <main>
   <ContactForm/>
  </main>
</template>
