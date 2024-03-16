package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitAutocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = webDriver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("RT Nagar, Bengaluru-560032");

        WebDriverWait wait = new WebDriverWait(webDriver,Duration.ofSeconds(10));
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dismissButton")));
        autocompleteResult.click();
        webDriver.quit();
    }
}
