package selenium_scripts_assignments_6to11;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_11 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"banner\"]/div[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println("Alert text: " + alerttext);
		alert.accept();
		
		
		
		
		
	}

}
