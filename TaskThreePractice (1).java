package Udemy.LoginProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TaskThreePractice {
	WebDriver driver;
	public static void main(String[] args) throws Exception {
		TaskThreePractice obj=new TaskThreePractice();
		obj.openbrowser("chrome");
		obj.opensauce("performance_glitch_user","secret_sauce");
		obj.openbrowser("firefox");
		obj.opensauce("error_user","secret_sauce");
		obj.openbrowser("Edge");
		obj.opensauce("locked_out_user","secret_sauce");
	}
	public void openbrowser(String browsername) {
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
	}
	
	public void opensauce(String username,String password) throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
