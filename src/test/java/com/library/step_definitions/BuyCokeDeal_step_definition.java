package com.library.step_definitions;

import com.library.pages.Homepage;
import com.library.utility.BrowserUtils;
import com.library.utility.ConfigurationReader;
import com.library.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BuyCokeDeal_step_definition {

    Homepage element = new Homepage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("GiantURL"));


    }

    @Then("I click to menu dropdown")
    public void i_click_to_menu_dropdown() {
        element.menu_dropdown.click();

    }

    @Then("I click to Weekly Ad")
    public void i_click_to_weekly_ad() {
        element.weekly_ad.click();

    }

    @Then("I click to coke to add my cart")
    public void i_click_to_coke_to_add_my_cart() {
        element.coke_deal.click();

    }

    @And("I add {string} to my cart")
    public void iAddToMyCart(String coke) {
        element.drPepperZeroSugar.click();
        element.cherryCola.click();
    }


    @Then("I close page")
    public void i_close_page() {
        element.close_coke_deal_page.click();

    }

    @And("Click to Cart sign")
    public void clickToCartSign() {
        element.cart_button.click();
    }

    @Then("Click to checkout button")
    public void click_to_checkout_button() {
        element.checkout.click();


    }

}

