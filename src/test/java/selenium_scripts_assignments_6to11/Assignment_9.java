package selenium_scripts_assignments_6to11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_9 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String fntext = driver.findElement(By.id("firstNameError")).getText();
		System.out.println(fntext);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		// to get all the error messages by using single/common locator
		
		List<WebElement> allErrMsg =  driver.findElements(By.className("formValidationMessage"));
		for (WebElement abc : allErrMsg) {
			System.out.println(abc.getText());
			
		}
		
		
	}

}
