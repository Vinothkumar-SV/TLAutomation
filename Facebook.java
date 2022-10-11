package week1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//form[@id='reg']//input[@name='firstname']")).sendKeys("Vinoth");
		driver.findElement(By.xpath("//form[@id='reg']//input[@name='lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//form[@id='reg']//input[@aria-label='Mobile number or email address']"))
				.sendKeys("8220316109");
		driver.findElement(By.xpath("//form[@id='reg']//input[@autocomplete='new-password']")).sendKeys("vinothSV@09");

		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(element);
		day.selectByVisibleText("18");

		WebElement element1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(element1);
		month.selectByVisibleText("Mar");

		WebElement element2 = driver.findElement(By.xpath("//select[@id='year']"));
		

		Select year = new Select(element2);
		year.selectByVisibleText("1995");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
		

	}

}
