package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) {
		//set the path
		WebDriverManager.chromedriver().setup();
		//Create obj for ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("https://www.redbus.in/");
		//max my window
		driver.manage().window().maximize();
		//add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("src")).sendKeys("Madiwala Bangalore",Keys.ENTER);
        driver.findElement(By.id("dest")).sendKeys("Koyambedu Chennai",Keys.ENTER);
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tr[7]/td[6]")).click();
		driver.getTitle();
		
		
		
	}

}
