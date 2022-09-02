package OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
public class AddUser {
    WebDriver driver;

    public AddUser(WebDriver driver){
        this.driver=driver;
    }
    public void addUser() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
        driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Enabled')]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Admin");
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("123");
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("Password@1");
        driver.findElement(By.xpath("(//div[@class='oxd-input-group oxd-input-field-bottom-space'])[5]")).sendKeys("Password@1");
    }
}
