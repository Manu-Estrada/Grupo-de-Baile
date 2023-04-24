import { defineStore } from 'pinia'
import { ref } from 'vue';

export const imageAboutUs = defineStore ('auth', () => {
	const aboutUsImageObject = ref([]);
	return aboutUsImageObject
})