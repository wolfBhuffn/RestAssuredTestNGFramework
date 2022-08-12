package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.pom.base.BasePage;

public class CartPage extends BasePage {
    private final By productName = By.xpath("//td[@class='product-name']");
    private final By checkoutBtn = By.cssSelector(".checkout-button");
    private final By cartHeading = By.xpath("//h1[@class='has-text-align-center']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    /*public Boolean isLoaded() {
        return wait.until(ExpectedConditions.textToBe(cartHeading, "Cart"));
    }*/

    public String getProductName() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(productName)).getText();
    }

    public CheckoutPage checkout() {
        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn)).click();
        return new CheckoutPage(driver);
    }
}
