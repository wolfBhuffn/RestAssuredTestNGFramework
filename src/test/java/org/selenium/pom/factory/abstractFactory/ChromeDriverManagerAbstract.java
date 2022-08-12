package org.selenium.pom.factory.abstractFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManagerAbstract extends DriverManagerAbstract {



    @Override
    protected void startDriver() {
        WebDriverManager.chromedriver().cachePath("Drivers").setup(); // checks the version of the browser installed on your machine, it matches the version of the driver, if unknown it uses the latest version of the driver. it downloads the latest version if it's not present. it exports the proper WebDriver Java Environment variables  required by selenium
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
