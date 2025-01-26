package selenium_scripts_assignments_6to11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7iii {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://autotestdata.com/");
        driver.findElement(By.linkText("Need Help?")).click();
        

	}

}
