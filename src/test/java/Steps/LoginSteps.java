package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class LoginSteps extends CommonMethods {
    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLaunchApplication();

    }

    @When("user enter username")
    public void user_enter_username() {

        sendText(login.usernameTextField, "admin");

    }
        @When("user enter password")
        public void user_enter_password() {
            sendText(login.passwordTextField, "Hum@nhrm123");
            System.out.println("we are young");
        }

//        WebElement usernameField = driver.findElement(By.id("txtUsername"));
//        usernameField.sendKeys("admin");
//        WebElement passwordField = driver.findElement(By.id("txtPassword"));
//        passwordField.sendKeys("Hum@nhrm123");

    @And("user clicks on login button")
    public void user_clicks_on_login_button() {
    click(login.loginButton);
    }

    @Then("user close the browser")
    public void user_close_the_browser() {
       // closeBrowser();

    }
}
