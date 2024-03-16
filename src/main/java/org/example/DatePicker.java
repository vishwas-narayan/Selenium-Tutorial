package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = webDriver.findElement(By.id("datepicker"));
        dateField.sendKeys("24/10/2024");
        Thread.sleep(2000);
        dateField.sendKeys(Keys.RETURN);
        webDriver.quit();
    }
}
