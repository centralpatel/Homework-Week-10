package com_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi_Browser {
    static String browser = "Firefox";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
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

        } else if (browser.equalsIgnoreCase("Chrome")) {
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

        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
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
        } else {
            System.out.println("Browser doesn't Match");
        }
    }
}
