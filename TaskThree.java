package Udemy.LoginProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskThree {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		TaskThree obj=new TaskThree();
		obj.browser("chrome");
		obj.login("locked_out_user","secret_sauce");
		obj.browser("Edge");
		obj.login("problem_user","secret_sauce");
		obj.browser("firefox");
		obj.login("visual_user","secret_sauce");
	}
	public void browser(String browsername){
		if(browsername.equals("chrome")) {
		//	WebDriverManager.chromedriver().setup(); 
			driver=new ChromeDriver();
		}
		else if(browsername.equals("Edge")) {
			driver=new EdgeDriver();
		}
		else if(browsername.equals("firefox")) {
			driver=new FirefoxDriver(); 
		}
		driver.manage().window().maximize();
	
	}
	public void login(String username,String password) throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
