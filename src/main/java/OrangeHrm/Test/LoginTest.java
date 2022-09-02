package OrangeHrm.Test;

import OrangeHrm.Pages.PageFactory;

public class LoginTest extends BaseClass{
    public static void main(String[]args) throws InterruptedException {
        setup();
        pageFactory.getLoginPage().login();
        pageFactory.getMenu().menu();
        pageFactory.getAdminPage().admin();
        pageFactory.getAddUser().addUser();
        //close();
    }
}
