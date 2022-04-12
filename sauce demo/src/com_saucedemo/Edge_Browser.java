package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Edge_Browser {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String tittle = driver.getTitle();
        System.out.println(tittle);

        System.out.println("Current url = " + driver.getCurrentUrl());
        System.out.println("Current Page source = " + driver.getPageSource());

        WebElement usernamefield = driver.findElement(By.id("user-name"));
        usernamefield.sendKeys("Rasi33");

        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("Abc1234!");

        driver.close();
    }
}
