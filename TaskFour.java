package Udemy.LoginProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TaskFour {
	WebDriver driver;
	public static void main(String[] args) throws Exception {
		TaskFour obj=new TaskFour();
		obj.sauce("chrome","performance_glitch_user", "secret_sauce");
	}
	public void sauce(String browsername,String username,String password ) throws InterruptedException {
		if(browsername.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("Edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
