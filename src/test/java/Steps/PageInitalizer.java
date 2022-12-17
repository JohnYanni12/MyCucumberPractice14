package Steps;

import Pages.ChooseWorkShiftPage;
import Pages.LoginPage;

public class PageInitalizer {

    public static LoginPage login;
    public static ChooseWorkShiftPage admin;



    public static void intializePageObjects() {
       login = new LoginPage();
       admin = new ChooseWorkShiftPage();

    }
}
