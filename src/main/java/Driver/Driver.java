package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static void main (String[] arg) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://github.com/login");

        WebElement Password = driver.findElement(By.id("password"));
        WebElement Login = driver.findElement(By.cssSelector("#login_field"));


        Login.sendKeys("d.pasichnechenko@gmail.com");
        Password.sendKeys("vjyfxrf21");
        driver.findElement(By.cssSelector("#login > form > div.auth-form-body.mt-3 > input.btn.btn-primary.btn-block")).click();
        driver.findElement(By.cssSelector("body > div.application-main > div > div.team-left-column.col-12.col-md-4.col-lg-3.bg-white.border-right.border-bottom.hide-md.hide-sm > div.dashboard-sidebar.js-sticky.top-0.px-3.px-md-4.px-lg-4.overflow-auto > div > div > h4 > a")).click();
        driver.findElement(By.cssSelector("#repository_name")). sendKeys("Homework");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#new_repository > div.js-with-permission-fields > button")).click();
        


        Thread.sleep(2000);


        driver.close();
        driver.quit();
    }

}
