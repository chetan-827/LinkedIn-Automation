package Udemy.LoginProject;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tasktwo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 1:Chrome 2:Edge 3:Firefox");
		String Browser=input.next();
		
		switch(Browser) {
		case "Chrome":
			//chrome
			System.out.println("Verification in chrome");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			driver.close();
			break;
		case "Edge":
			//Edge
			System.out.println("Verification in Edge");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			driver.close();
			break;
		case "Firefox":
			//Firefox
			System.out.println("Verification in FireFox");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(2000);
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			driver.close();
			break;
		}
		
	}

}
