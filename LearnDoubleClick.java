package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDoubleClick {

	public static void main(String[] args) {
		//set the path
				WebDriverManager.chromedriver().setup();
				//Create obj for ChromeDriver
				ChromeDriver driver=new ChromeDriver();
				//Load the url
				driver.get("https://www.myntra.com/");
				//max my window
				driver.manage().window().maximize();
				//add the wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		        //Create object for Actions Class
		        Actions builder=new Actions(driver);
		        builder.moveToElement(men).pause(2000).doubleClick().perform();


	}

}
