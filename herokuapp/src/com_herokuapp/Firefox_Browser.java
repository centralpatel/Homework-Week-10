package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox_Browser {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current URL = " + driver.getCurrentUrl());
        System.out.println("Current Page source = " + driver.getPageSource());

        WebElement emailfield = driver.findElement(By.id("username"));
        emailfield.sendKeys("Rose23");

        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("Abc123!");

        driver.close();
    }
}
