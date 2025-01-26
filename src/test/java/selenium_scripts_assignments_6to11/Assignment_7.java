package selenium_scripts_assignments_6to11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup/");
        driver.findElement(By.linkText("terms & conditions")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        

	}

}
