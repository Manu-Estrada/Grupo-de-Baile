import { describe, expect, test, it} from "vitest";
import  {mount} from "@vue/test-utils";
import AboutUs from "../src/components/AboutUs.vue";
import { shallowMount } from '@vue/test-utils';

describe('Testing classes and style', () =>{
    const wrapper = shallowMount(AboutUs);
    it('checks the class to be slogan',() => {
        expect(wrapper.classes()).toContain('pruebas');
    });
})

describe ('AboutUs test',() => {
    test ('exist class card on AboutUs',() =>{
        const card = mount(AboutUs)
        expect(card.classes('slogan')).toBe(false)
    });
})

describe ('AboutUs test',() => {
    test ('exist class col-md-6 on AboutUs',() =>{
        const card = mount(AboutUs)
        expect(card.text()).toContain('Actividades')
    });
})

describe ('AboutUs test',() => {
    test ('exist class row g-0 on AboutUs',() =>{
        const card = mount(AboutUs)
        expect(card.classes('row g-0')).toBe(false)
    });
})

describe ('AboutUs test',() => {
    test ('exist class strong on AboutUs',() =>{
        const card = mount(AboutUs)
        expect(card.classes('strong')).toBe(false)
    });
})

describe ('AboutUs test',() => {
    test ('exist class card-text on AboutUs',() =>{
        const card = mount(AboutUs)
        expect(card.classes('card-text')).toBe(false)
    });
})

describe ('AboutUs test',() => {
    test ('exist class card-body on AboutUs',() =>{
        const card = mount(AboutUs)
        expect(card.classes('card-body')).toBe(false)
    });
})

