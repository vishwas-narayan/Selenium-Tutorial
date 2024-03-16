package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.ConfirmationPage;
import pages.FormPage;

import static pages.ConfirmationPage.getAlertBannerText;


public class Form {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://formy-project.herokuapp.com/form");
        FormPage formPage = new FormPage();
        formPage.submitForm(webDriver);
        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForAlertBanner(webDriver);
        System.out.println(getAlertBannerText(webDriver));
        webDriver.quit();
    }

}
