package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class ChooseWorkShiftSteps  extends CommonMethods {



    @When("user hover over Admin")
    public void user_hover_over_admin() {
        click(admin.AdminOption);

    }

    @When("user clicks on the drop down job button")
    public void user_clicks_on_the_drop_down_job_button() {
        click(admin.jobOption);
    }

    @When("user clicks on work shift")
    public void user_clicks_on_work_shift() {
//        Select select = new Select(dropDown);

        }

    @Then("user click on night shift check box")
    public void user_click_on_night_shift_check_box() {

    }
}