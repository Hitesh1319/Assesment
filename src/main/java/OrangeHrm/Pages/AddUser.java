package OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class AddUser {
    WebDriver driver;
    By userRole= By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
    By userRoleDrop= By.xpath("//*[contains(text(),'Admin')]");
    By status=By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");
    By statusDrop=By.xpath("//*[contains(text(),'Disabled')]");
    By employeeName=By.xpath("//input[@placeholder='Type for hints...']");
    By username =By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By password=By.xpath("(//input[@type='password'])[1]");
    By comfirmPassword=By.xpath("(//input[@type='password'])[2]");
    By save=By.xpath("//div[@class='oxd-form-actions']//button[@type='submit']");
    By cancel = By.xpath("(//button[@type='button'])[2]");
    Random random = new Random();
    int randomNum = random.nextInt(1000);
    public AddUser(WebDriver driver){
        this.driver=driver;
    }
    public void addUser() throws InterruptedException {
        driver.findElement(userRole).click();
        driver.findElement(userRoleDrop).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(status).click();
        driver.findElement(statusDrop).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(employeeName).sendKeys("Sania");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[contains(text(),'Sania')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(username).sendKeys("UserName"+randomNum);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(password).sendKeys("Password@1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(comfirmPassword).sendKeys("Password@1");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(6000);
        driver.findElement(save).click();
//        WebElement save = driver. findElement(By.xpath("//button[@type='submit']"));
//        String javascript = "arguments[0]. click()";
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript(javascript, save);
    }
}
