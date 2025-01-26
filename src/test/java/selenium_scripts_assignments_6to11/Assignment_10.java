package selenium_scripts_assignments_6to11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_10 {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://practice.automationtesting.in/shop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a[2]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.className("cartcontents")).click();
		driver.findElement(By.className("amount")).click();
		driver.findElement(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div/div/div/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement abc=driver.findElement(By.xpath("//*[@id=\"place_order\"]"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", abc);
		List<WebElement> allErrMsg =  driver.findElements(By.className("woocommerce-error"));
		for (WebElement xyz : allErrMsg) {
			System.out.println(xyz.getText());
			
		
	
		
		
	}

	} 
	}
