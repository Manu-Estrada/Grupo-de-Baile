import { describe, it, expect } from "vitest";
import SliderComponent from "../src/components/home-components/SliderComponent.vue"; 
import { mount } from "@vue/test-utils";
describe("SliderComponent", () => {
  it("should have div tag", () => {
    const wrapper = mount(SliderComponent);
    const headerTag = wrapper.find("div").exists();
    expect(headerTag).toBe(true);
  });
});