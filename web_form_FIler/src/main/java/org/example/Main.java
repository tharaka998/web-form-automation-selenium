package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Browser;

import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation Projects\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");

        //Enter firs tname
        WebElement InputFirstName = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));

        InputFirstName.click();
        InputFirstName.sendKeys("Tharaka");

        //Enter Last name
        WebElement InputLastName = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));

        InputLastName.click();
        InputLastName.sendKeys("Ekanayake");

        //Enter Email
        WebElement InputEmail = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));

        InputEmail.click();
        InputEmail.sendKeys("tharakae@gmail.com");

        //Enter Telephone
        WebElement InputTelephone = driver.findElement(By.xpath("//*[@id=\"input-telephone\"]"));

        InputTelephone.click();
        InputTelephone.sendKeys("+94778851345");

        //Enter Password
        WebElement InputPassword = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        InputPassword.click();
        InputPassword.sendKeys("Password");

        //Enter Password Confirm
        WebElement InputConfirmPassword = driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
        InputConfirmPassword.click();
        InputConfirmPassword.sendKeys("Password");

        //SubscribeButton
        WebElement SubscribeButton = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/div[1]/label"));
        SubscribeButton.click();

        //Privacy Policy
        WebElement PrivacyPolicy = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div"));
        PrivacyPolicy.click();

        //Continue
        WebElement Continue = driver.findElement(By.xpath("//input[@value='Continue']"));
        Continue.click();

        driver.quit();

    }
}