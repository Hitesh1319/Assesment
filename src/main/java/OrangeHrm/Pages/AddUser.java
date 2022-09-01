package OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class AddUser {
    WebDriver driver;
    //By userRole= By.xpath(("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
   // By employeeName=By.xpath("(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active'])");
  //  By userName=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    //Select dropUserRole= new Select(driver.findElement(userRole));
    public AddUser(WebDriver driver){
        this.driver=driver;
    }
    public void addUser() throws InterruptedException {
       // dropUserRole.selectByIndex(1);
      //  driver.findElement(employeeName).sendKeys("Random");
      //  driver.findElement(userName).sendKeys("Employee1");
        driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
        driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Enabled')]")).click();
        driver.findElement(By.xpath("(//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active'])[1]")).sendKeys("Random");
        driver.findElement(By.xpath("(//(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("Employee 1");
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Tester1");
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])3]")).sendKeys("Password");
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("Password");
    }
}
