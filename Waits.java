package week1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
		
		
		
		
		
		/*
		 * driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		 * driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		 * driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		 * driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		 */
	}

}
