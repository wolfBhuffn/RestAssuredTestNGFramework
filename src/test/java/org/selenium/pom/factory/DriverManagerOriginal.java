package org.selenium.pom.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.selenium.pom.constants.DriverType;

public class DriverManagerOriginal {

    public WebDriver initializeDriver(String browser) { //the only job for this method is to initialize the driver and return the web driver object
        WebDriver driver;
        switch (DriverType.valueOf(browser)) {
            case CHROME -> {
                WebDriverManager.chromedriver().cachePath("Drivers").setup(); // checks the version of the browser installed on your machine, it matches the version of the driver, if unknown it uses the latest version of the driver. it downloads the latest version if its not present. it exports the proper WebDriver Java Environment variables  required by selenium
                driver = new ChromeDriver(); // intialize the ChromeDriver object
            }
            case FIREFOX -> {
                WebDriverManager.firefoxdriver().cachePath("Drivers").setup();
                driver = new FirefoxDriver();// initialize the firefox driver
            }
            default -> throw new IllegalStateException("Invalid browser name: " + browser);
        }
//^^ to execute the chromedriver test in the terminal : mvn clean test -Dbrowser=CHROME
//^^ to execute the firefoxdriver test in the terminal : mvn clean test -Dbrowser=FIREFOX



        //^^ https://github.com/bonigarcia/webdrivermanager ^^
        //^^ download the maven dependencies, paste in the POM.xml
        //^^ dont forget to REFRESH the maven project!!!
//        WebDriverManager.firefoxdriver().cachePath("Drivers").setup();

        //  WebDriver driver = new ChromeDriver(); // intialize the ChromeDriver object
//        WebDriver driver = new FirefoxDriver();// initialize the firefox driver

        driver.manage().window().maximize();
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }
}
