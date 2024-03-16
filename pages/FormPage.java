package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {
    public static void submitForm(WebDriver webDriver){
        webDriver.findElement(By.id("first-name")).sendKeys("Vishwas");
        webDriver.findElement(By.id("last-name")).sendKeys("Narayan");
        webDriver.findElement(By.id("job-title")).sendKeys("QA Automation Engineer");
        webDriver.findElement(By.id("radio-button-3")).click();
        webDriver.findElement(By.id("checkbox-1")).click();
        webDriver.findElement(By.id("select-menu")).click();
        webDriver.findElement(By.cssSelector("option[value='2']")).click();
        webDriver.findElement(By.id("datepicker")).sendKeys("05/10/2024");
        webDriver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        webDriver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
