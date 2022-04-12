package com_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome_Browser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current URL = " + driver.getCurrentUrl());
        System.out.println("Current Page source = " + driver.getPageSource());

        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("xyz123gmail.com");

        WebElement passwordfield = driver.findElement(By.name("user[password]"));
        passwordfield.sendKeys("321zyx");

        driver.close();
    }
}
