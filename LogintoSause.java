package Udemy.LoginProject;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogintoSause {

	public static void main(String[] args) throws InterruptedException {
		// Login to sausedemo website
		// https://www.sausedemo.com
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 1:Chrome 2:Edge 3:firefox");
		int Browsers = input.nextInt();
		// WebDriver driver;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new FirefoxDriver();
		switch (Browsers) {
		case 1:
			
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver.findElement(By.id("login-button")).click();

		case 2:

			driver1.get("https://www.saucedemo.com/");
			driver1.manage().window().maximize();
			Thread.sleep(2000);
			driver1.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver1.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver1.findElement(By.id("login-button")).click();
		case 3:

			driver2.get("https://www.saucedemo.com/");
			driver2.manage().window().maximize();
			Thread.sleep(2000);
			driver2.findElement(By.id("user-name")).sendKeys("standard_user");
			Thread.sleep(2000);
			driver2.findElement(By.id("password")).sendKeys("secret_sauce");
			Thread.sleep(2000);
			driver2.findElement(By.id("login-button")).click();

		}

	}

}
