package Udemy.LoginProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TaskFourPractice {

	WebDriver driver;
	public static void main(String[] args) throws Exception {
		TaskFourPractice obj=new TaskFourPractice();
		obj.naukri("chrome","inturichetansai@gmail.com","Chetan@12345");
	}
	public void naukri(String browsername,String username,String password) throws Exception {
		if(browsername.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equals("Edge")){
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		driver.manage().deleteAllCookies();
	//	driver.findElement(By.xpath("//*[@type='text'and @class='err-border')]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[contains(@class,'btn-primary loginButton')]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
