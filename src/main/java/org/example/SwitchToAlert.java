package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/switch-window");

        //Input name
        WebElement alertButton = webDriver.findElement(By.id("alert-button"));
        alertButton.click();

        Alert alert = webDriver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        webDriver.quit();

    }
}
