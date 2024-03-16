package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownMenu {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDownMenu = webDriver.findElement(By.id("dropdownMenuButton"));
        dropDownMenu.click();
        Thread.sleep(2000);
        WebElement autocompleteItem = webDriver.findElement(By.id("autocomplete"));
        autocompleteItem.click();

        webDriver.quit();

    }
}
