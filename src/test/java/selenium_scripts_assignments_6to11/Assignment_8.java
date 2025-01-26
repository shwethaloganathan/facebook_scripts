package selenium_scripts_assignments_6to11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_8 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
		new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("Boston");
		new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("London");
		
	}

}
