package Udemy.LoginProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sauceloginlogout {

	static String title;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		//Opening Chrome browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Access the URL
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(null);
		//Verify the title of the screen
		
		title=driver.findElement(By.className("login_logo")).getText().trim();
		if(!title.equals("Swag Labs")) {
			System.out.println("Title is not displaying as Swag Labs but showing as-"+title);
			System.err.println("Title is not displaying as Swag Labs but showing as-"+title);
		}
		//Verify the Username control exist or not
		if(driver.findElement(By.id("user-name")).isDisplayed()==false) {
			System.err.println("Username control not exist in UI");
		}
		//Verify the Password control exist or not
		if(driver.findElement(By.id("password")).isDisplayed()==false) {
			System.out.println("Password control not exist in UI");
		}
		//Verify the label of the Username control
		title=driver.findElement(By.id("user-name")).getAttribute("placeholder");
		if(!title.equals("Username")) {
			System.err.println("Username label should be displayed as 'Username' but it is displaying as-"+title);
		}
		//Verify the label of the Password control
		title=driver.findElement(By.id("password")).getAttribute("placeholder");
		if(!title.equals("Password")) {
			System.err.println("Password label should be displayed as 'Password' but it is displaying as-"+title);
		}
		//Verify whether Login button exist or not
		if(driver.findElement(By.id("login-button")).isDisplayed()==false) {
			System.err.println("Login button is not exist");
			}
		//Verify the label of the Login button
		title=driver.findElement(By.id("login-button")).getAttribute("value");
		if(!title.equals("Login")) {
			System.err.println("Login label should be displayed as 'Login' but it is displaying as-"+title);
		}
		//Verify the color of Login button
		title=driver.findElement(By.id("login-button")).getCssValue("background-color");
		if(!title.equals("rgba(61, 220, 145, 1)")) {
			System.err.println("Login button color should be Green but id not displaying in green");
		}
		System.out.println(title);
		//Enter Username and with out entering password click on Login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("login-button")).click();
	//	Thread.sleep(2000);
		//Verify the message with out entering password click on Login
		title=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3")).getText();
		if(!title.equals("Epic sadface: Password is required")) {
			System.err.println("Error is showing please enter valid password-"+title);
		}
		driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/button")).click();
		driver.findElement(By.id("user-name")).clear();
	//	Thread.sleep(2000);
		//Enter valid username and invalid password and click on enter 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sause");
	//	Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		//Verify the message after performing above action
		//click on remove cursor
		driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/button")).click();
		//clear the password
		driver.findElement(By.id("password")).clear();
		//Enter valid password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	//	Thread.sleep(2000);
		driver.findElement(By.className("product_sort_container")).click();
		driver.findElement(By.xpath("//*[@id='header_container']/div[2]/div/span/select/option[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("item_3_title_link")).click();
		driver.findElement(By.id("add-to-cart")).click();
		String cartcount=driver.findElement(By.className("shopping_cart_badge")).getText();
		if(!cartcount.equals("1")) {
			System.err.println("Item not added to cart");
		}
		driver.findElement(By.id("back-to-products")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		if(driver.findElement(By.id("inventory_sidebar_link")).isDisplayed()==true) {
			
			System.out.println("All items button is in disabled state");
		}
		driver.findElement(By.id("about_sidebar_link")).click();
		driver.navigate().back();
		driver.findElement(By.id("react-burger-menu-btn")).click();
	//	Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
	//	Thread.sleep(1000);
		driver.quit();
		

	}

}
