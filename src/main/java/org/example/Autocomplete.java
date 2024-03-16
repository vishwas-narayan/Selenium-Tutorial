package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete = webDriver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("RT Nagar, Bengaluru-560032");
        Thread.sleep(1000);
        WebElement autocompleteResult = webDriver.findElement(By.className("pac-item"));
        autocompleteResult.click();
        webDriver.quit();
    }
}
