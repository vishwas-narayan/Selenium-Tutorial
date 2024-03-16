package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = webDriver.findElement(By.id("image"));
        WebElement box = webDriver.findElement(By.id("box"));
        Actions actions = new Actions(webDriver);
        actions.dragAndDrop(image, box).build().perform();
        Thread.sleep(2000);
        webDriver.quit();
    }
}
