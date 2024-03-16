package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

    public static void waitForAlertBanner(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        WebElement alert = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
    }

    public static String getAlertBannerText(WebDriver webDriver){
        return webDriver.findElement(By.className("alert")).getText();
    }
}
