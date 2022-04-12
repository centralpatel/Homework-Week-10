package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi_Browser {
    static String browser = "Edge";
    static String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            String title = driver.getTitle();
            System.out.println(title);
            System.out.println("Current URL = " + driver.getCurrentUrl());
            System.out.println("Current Page source = " + driver.getPageSource());
            WebElement emailfield = driver.findElement(By.id("Email"));
            emailfield.sendKeys("abc@gmail.com");
            WebElement passwordfield = driver.findElement(By.name("Password"));
            passwordfield.sendKeys("Abc123");
            driver.close();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            String title = driver.getTitle();
            System.out.println(title);
            System.out.println("Current URL = " + driver.getCurrentUrl());
            System.out.println("Current Page source = " + driver.getPageSource());
            WebElement emailfield = driver.findElement(By.id("Email"));
            emailfield.sendKeys("abc@gmail.com");
            WebElement passwordfield = driver.findElement(By.name("Password"));
            passwordfield.sendKeys("Abc123");
            driver.close();

        } else if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            String title = driver.getTitle();
            System.out.println(title);
            System.out.println("Current URL = " + driver.getCurrentUrl());
            System.out.println("Current Page source = " + driver.getPageSource());
            WebElement emailfield = driver.findElement(By.id("Email"));
            emailfield.sendKeys("abc@gmail.com");
            WebElement passwordfield = driver.findElement(By.name("Password"));
            passwordfield.sendKeys("Abc123");
            driver.close();
        } else {
            System.out.println("Driver doesn't match");
        }
    }
}

