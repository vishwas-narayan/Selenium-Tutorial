package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitAutocomplete {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = webDriver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("RT Nagar, Bengaluru-560032");
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement autocompleteResult = webDriver.findElement(By.className("dismissButton"));
        autocompleteResult.click();
        webDriver.quit();
    }
}
