package selenium_web_facebookscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_handling_scripts {
	 
	public static String year = "2008";
	public static String month = "May";
	public static String date = "5";

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")))
		.selectByVisibleText("August");
		
		//from the user perspective we should create global variables.
		
		new Select(driver.findElement(By.id("yearbox"))).selectByVisibleText(year);
		new Select(driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"))).selectByVisibleText(month);
		new Select(driver.findElement(By.id("daybox"))).selectByVisibleText(date);
	}

}
