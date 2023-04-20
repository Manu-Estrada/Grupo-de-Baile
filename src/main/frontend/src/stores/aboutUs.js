import { defineStore } from 'pinia'
import { ref } from 'vue';

export const aboutUs = defineStore ('aboutUs', () => {
	const aboutUsObject = ref([]);
	return aboutUsObject
})