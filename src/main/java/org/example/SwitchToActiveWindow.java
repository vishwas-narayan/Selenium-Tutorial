package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/switch-window");

        //Input name
        WebElement newTabButton = webDriver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = webDriver.getWindowHandle();
        for( String handle : webDriver.getWindowHandles()){
            webDriver.switchTo().window(handle);
        }
        Thread.sleep(2000);
        webDriver.switchTo().window(originalHandle);

        webDriver.quit();
    }
}
