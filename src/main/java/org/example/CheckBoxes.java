package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/checkbox");

        Thread.sleep(2000);
        WebElement checkBox1 = webDriver.findElement(By.id("checkbox-1"));
        checkBox1.click();
        Thread.sleep(2000);
        WebElement checkBox2 = webDriver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkBox2.click();
        Thread.sleep(2000);
        WebElement checkBox3 = webDriver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        checkBox3.click();

        webDriver.quit();
    }
}
