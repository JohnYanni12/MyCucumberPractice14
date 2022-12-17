package Pages;

import Steps.ChooseWorkShiftSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseWorkShiftPage {

    @FindBy(id="menu_admin_viewAdminModule")
    public WebElement AdminOption;

    @FindBy(id="menu_admin_Job")
    public WebElement jobOption;

    @FindBy(id="menu_admin_workShift")
    public WebElement WorkSiftBtn;

//    WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));

}
