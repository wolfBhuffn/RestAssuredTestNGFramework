package org.selenium.pom.factory.abstractFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManagerAbstract extends DriverManagerAbstract {
    private WebDriver driver;

    @Override
    protected void startDriver() {
        WebDriverManager.firefoxdriver().cachePath("Drivers").setup(); // checks the version of the browser installed on your machine, it matches the version of the driver, if unknown it uses the latest version of the driver. it downloads the latest version if it's not present. it exports the proper WebDriver Java Environment variables  required by selenium
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
}
