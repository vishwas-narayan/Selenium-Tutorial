package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/scroll");

        //Input name
        WebElement name = webDriver.findElement(By.id("name"));
        Actions actions = new Actions(webDriver);
        actions.moveToElement(name);
        name.sendKeys("Vishwas Narayan");
        //Input the date
        WebElement date = webDriver.findElement(By.id("date"));
        date.sendKeys("15/03/2024");
        webDriver.quit();

    }
}
