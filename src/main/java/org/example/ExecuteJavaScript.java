package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class ExecuteJavaScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/modal");

        //Input name
        WebElement modalButton = webDriver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = webDriver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("arguments[0].click();", closeButton);

        webDriver.quit();

    }
}
