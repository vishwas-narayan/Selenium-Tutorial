package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/radiobutton");

        Thread.sleep(2000);
        WebElement radioButton1 = webDriver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        Thread.sleep(2000);
        WebElement radioButton2 = webDriver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        Thread.sleep(2000);
        WebElement radioButton3 = webDriver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();

        webDriver.quit();
    }
}
