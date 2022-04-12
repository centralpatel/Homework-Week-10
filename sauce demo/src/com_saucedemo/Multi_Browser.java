package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class Multi_Browser {

    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            String title = driver.getTitle();
            System.out.println(title);
            System.out.println("Current URL = " + driver.getCurrentUrl());
            System.out.println("Current Page source = " + driver.getPageSource());
            WebElement usernamefield = driver.findElement(By.id("user-name"));
            usernamefield.sendKeys("Rasi33");
            WebElement passwordfield = driver.findElement(By.name("password"));
            passwordfield.sendKeys("Abc1234!");
            driver.close();

        }else if (browser.equalsIgnoreCase("Edge")){
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

        }else if (browser.equalsIgnoreCase("Firefox")){
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

        }else {
            System.out.println("Browser doesn't match");
        }
    }
}
