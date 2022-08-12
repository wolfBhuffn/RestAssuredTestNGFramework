package org.selenium.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager implements DriverManager{

    @Override
    public WebDriver createDriver() {
        WebDriverManager.chromedriver().cachePath("Drivers").setup(); // checks the version of the browser installed on your machine, it matches the version of the driver, if unknown it uses the latest version of the driver. it downloads the latest version if its not present. it exports the proper WebDriver Java Environment variables  required by selenium
       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

}
