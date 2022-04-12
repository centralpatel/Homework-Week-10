package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox_Browser {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current URL = " + driver.getCurrentUrl());
        System.out.println("Current Page source = " + driver.getPageSource());

        WebElement usernamefield = driver.findElement(By.id("user-name"));
        usernamefield.sendKeys("Rasi33");

        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("Abc1234!");

        driver.close();
    }
}
