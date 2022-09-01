package OrangeHrm.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    static WebDriver driver;
    private static LoginPage loginPage;
    public PageFactory(WebDriver driver){
        this.driver =driver;
    }

    public static LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
}
