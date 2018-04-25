package Home;

import base.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import base.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.Keys.ENTER;

public class SerchPage{

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.walmart.com");
        driver.findElement(By.id("header-search-input")).sendKeys("Dell",ENTER);

    }
}