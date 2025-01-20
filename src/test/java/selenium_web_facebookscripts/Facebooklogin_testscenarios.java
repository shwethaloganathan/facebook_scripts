package selenium_web_facebookscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin_testscenarios {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email"));
		driver.findElement(By.name("pass")).sendKeys("apple123");
		driver.findElement(By.name("login")).click();
	}

}
