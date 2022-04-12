package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge_Browser {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current URL = " + driver.getCurrentUrl());
        System.out.println("Current Page source = " + driver.getPageSource());

        WebElement usernamefield = driver.findElement(By.id("txtUsername"));
        usernamefield.sendKeys("Admin");

        WebElement passwordfield = driver.findElement(By.name("txtPassword"));
        passwordfield.sendKeys("admin123");

        driver.close();
    }
}
