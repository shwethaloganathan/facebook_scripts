package selenium_scripts_assignments_6to11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_12i {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("(//input[@value='Choose This Flight'])[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("shwejlkjoij");
        driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("1st main, richard colony");
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("klhdsn");
        driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("xyz");
        driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("56754");
        //driver.findElement(By.xpath("//*[@id=\"cardType\"]")).sendKeys("287857070098");
        new Select(driver.findElement(By.xpath("//*[@id=\"cardType\"]"))).selectByVisibleText("American Express");
        driver.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).sendKeys("287857070098");
        driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).sendKeys("05");
        driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).sendKeys("2008");
        driver.findElement(By.xpath("//*[@id=\"nameOnCard\"]")).sendKeys("john");
        driver.findElement(By.xpath("//*[@id=\"rememberMe\"]")).click();
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
        
        List<WebElement> thankuMsg =  driver.findElements(By.xpath("//div[@class='container hero-unit']"));
		for (WebElement abc : thankuMsg) {
			System.out.println(abc.getText());
			
	}

}
}