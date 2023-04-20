import { defineStore } from 'pinia'
import { ref } from 'vue';

export const imageOurTravels = defineStore ('auth', () => {
	const imageOurTravelsObject = ref([]);
	return imageOurTravelsObject
})