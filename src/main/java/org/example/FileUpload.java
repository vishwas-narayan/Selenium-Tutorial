package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField = webDriver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("Tesla.jpg");
        webDriver.quit();
    }
}
