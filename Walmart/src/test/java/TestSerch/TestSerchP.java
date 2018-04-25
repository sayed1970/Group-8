package TestSerch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSerchP {

    @Test

    public void serchPage(){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.walmart.com");
        Assert.assertTrue ("title should start with walmart",
                driver.getTitle ().startsWith ("Walmart" ));
        driver.close();
        driver.quit();
    }
}

