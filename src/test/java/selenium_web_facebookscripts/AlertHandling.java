package selenium_web_facebookscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts#google_vignette");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		

	}

}
