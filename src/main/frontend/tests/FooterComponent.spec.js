import { describe, expect, test} from "vitest";
import {mount} from "@vue/test-utils";
import FooterComponent from "../src/components/componentsVue/FooterComponent.vue" 

describe ('FooterComponent', () => {
    test('exist class icons on FooterComponent'() => {
    const icons = mount(FooterComponent)
    expect(icons.classes('icons')).toBe(true)
    });
   
})
