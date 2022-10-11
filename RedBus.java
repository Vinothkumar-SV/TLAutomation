package selenium.week2.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[text()='16']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		String text = driver.findElement(By.xpath("//div[@class='w-30 fl']//span[@class='f-bold busFound']")).getText();
		System.out.println(text);
		
		//Close Notification
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='close-primo']")).click();
		//Sleeper- Element Click Intercepted Exception- so use  JavaScript Click
		Thread.sleep(5000);
		WebElement sleeperElement = driver.findElement(By.xpath("//label[@title='SLEEPER']"));
		   driver.executeScript("arguments[0].click();",sleeperElement);
		   
		//View Seats
		driver.findElement(By.xpath("//div[@class='button view-seats fr']")).click();
		String priceText = driver.findElement(By.xpath("//span[@class='f-19 f-bold']")).getText();
		System.out.println(priceText);
		
		//no of seats available
		String seats = driver.findElement(By.xpath("//div[@class='seat-left m-top-30']")).getText();
		System.out.println(seats);
		
	}

}
