import { defineStore } from 'pinia'
import { ref } from 'vue';

export const user = defineStore ('auth', () => {
	const userObject = ref([]);
	return userObject
})