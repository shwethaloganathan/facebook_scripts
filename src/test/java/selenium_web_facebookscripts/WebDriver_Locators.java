package selenium_web_facebookscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Locators {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.txdpsscheduler.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div[2]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div/section/div/main/div/section/div[2]/div/div/form/div[2]/div[3]/div[1]/div/div[1]/div/input")).sendKeys("987654321");
		
	}

}
