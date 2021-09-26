package steps;

import impl.SauceDemoImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.WebDriverUtils;

public class SauceDemoSteps {
    SauceDemoImpl impl = new SauceDemoImpl();

    @Given("I navigate to sauceDemo website")
        public void iNavigateToSauceDemoWebsite() {
        impl.navigateToHomepage();
    }

    @When("I input username")
        public void iInputUsername() {
        impl.getPage().uName.sendKeys("standard_user");
    }

    @When("I click LOGIN button")
    public void i_click_login_button() {
        impl.getPage().loginBtn.click();
    }

    @When("I click LOGIN button, in case of the password is correct")
    public void i_click_login_button_in_case_of_the_password_is_correct() {
        impl.getPage().loginBtn.click();
    }

    @Then("Verify if {string} is required appear")
    public void verify_if_is_required_appear(String expectedMsg) {
        String actualText = impl.getText();
        Assert.assertEquals(expectedMsg, actualText);
    }

    @When("I put wrong Password")
    public void i_put_wrong_password() {
        impl.getPage().pWord.sendKeys("wrongPassword");
    }

    @When("I put correct Password")
    public void i_put_correct_password() {
        impl.getPage().pWord.sendKeys("secret_sauce");
    }

    @Then("Verify if login was successful The new window title would be {string}")
    public void verify_if_login_was_successful_the_new_window_title_would_be(String linkText) {
        String text = WebDriverUtils.getDriver().getTitle();
        Assert.assertEquals(linkText, text);
    }
}
