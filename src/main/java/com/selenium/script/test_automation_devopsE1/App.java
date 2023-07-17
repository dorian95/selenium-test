package com.selenium.script.test_automation_devopsE1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	//System.setProperty("webdriver.chrome.driver","C:\\Downloads\\chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver", "/home/subhasis/chromedriver");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver(option);

        // Open Facebook login page
        driver.get("https://www.facebook.com/");

        // Find the email input field and enter your email address
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("your_email@example.com");

        // Find the password input field and enter your password
        WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys("your_password");
        

        // Find the login button and click it
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        //driver.quit();
    }
}
