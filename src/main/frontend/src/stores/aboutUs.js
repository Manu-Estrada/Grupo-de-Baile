import { defineStore } from 'pinia'
import { ref } from 'vue';

export const aboutUs = defineStore ('auth', () => {
	const aboutUsObject = ref([]);
	return aboutUsObject
})