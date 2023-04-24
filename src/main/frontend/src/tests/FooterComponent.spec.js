import { describe, expect, test, it} from "vitest";
import {mount} from "@vue/test-utils";
import FooterComponent from "../components/FooterComponent.vue";
import AboutUs from "../components/AboutUs.vue";
import { shallowMount } from '@vue/test-utils';

describe ('FooterComponent', () => {
    test('exist class icons on FooterComponent',() => {
    const icons = mount(FooterComponent)
    expect(icons.classes('icons')).toBe(false)
    });
   
})


describe('Testing classes and style', () =>{
    const wrapper = shallowMount(AboutUs);
    it('checks the class to be slogan',() => {
        expect(wrapper.classes()).toContain('aboutus');
    });
})