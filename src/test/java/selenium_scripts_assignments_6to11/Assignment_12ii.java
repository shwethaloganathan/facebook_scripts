package selenium_scripts_assignments_6to11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_12ii {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.linkText("Practice Site")).click();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("seenu4selenium@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("seenu4selenium@123");
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign out")).click();

	}

}
