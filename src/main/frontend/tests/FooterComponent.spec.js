import { describe, expect, it, test} from "vitest";
import {mount} from "@vue/test-utils";
import FooterComponent from "../src/components/FooterComponent.vue";
import { shallowMount } from "@vue/test-utils";

describe('FooterComponent', () => {
    test('exist text Danzar es avanzar en la vida, por lo tanto, seguir danzando para seguir avanzando on FooterComponent',() => {
    const wrapper = mount(FooterComponent)
    expect(wrapper.text()).toContain('Danzar es avanzar en la vida, por lo tanto, seguir danzando para seguir avanzando')
    });
})

describe('FooterComponent', () => {
    test('exist la ruta nuestrosviajes on FooterComponent',() => {
    const routerLink = mount(FooterComponent)
    expect(routerLink.text()).toContain('Nuestros viajes')
    });
  
})

describe('Testing classes', () => {
    const wrapper  = shallowMount(FooterComponent);
    it('checks the class to be nav-link',() => {
        expect(wrapper.classes()).toContain('footer', 'w-1002');
    })
})
