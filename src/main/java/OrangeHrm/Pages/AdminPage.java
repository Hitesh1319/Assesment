package OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    WebDriver driver;
    By admin= new By.ByClassName("oxd-text oxd-text--span oxd-main-menu-item--name");
  //  public adminPage(WebDriver driver){
  //      this.driver=driver;
    //}
    public void admin(){
        driver.findElement(admin).click();
    }
}
