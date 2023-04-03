import { expect, test} from "vite";
import {render, screen} from "@vue/test-utils"
import FooterComponent from "../src/components/componentsVue/FooterComponent.vue" 

test ('renders Xareu', () => {
    render(<FooterComponent />);
    const linkElement = screen.getByText(/Xareu/i);
    expect(linkElement).toBeTheDocument();
});
