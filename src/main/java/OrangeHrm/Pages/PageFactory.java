package OrangeHrm.Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    static WebDriver driver;
    private static LoginPage loginPage;
    private static AdminPage adminPage;
    private static Menu menu;
    private static AddUser addUser;
    public PageFactory(WebDriver driver){
        this.driver =driver;
    }

    public static LoginPage getLoginPage(){
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public static AdminPage getAdminPage(){
        if(adminPage == null){
            adminPage =new AdminPage(driver);
        }
        return adminPage;
    }
    public static Menu getMenu(){
        if(menu == null){
            menu = new Menu(driver);
        }
        return menu;
    }
    public static AddUser getAddUser(){
        if(addUser == null){
            addUser = new AddUser(driver);
        }
        return addUser;
    }
}
