package assignment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {

	public static void main(String[] args) {
		//set the path
		WebDriverManager.chromedriver().setup();
		//Create obj for ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//max my window
		driver.manage().window().maximize();
		//add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//multiple element
		List<WebElement> inputTag = driver.findElements(By.className("inputLogin"));
		int size = inputTag.size();
		System.out.println(size);
		for (WebElement output : inputTag) {
			 String attributeValue = output.getAttribute("class");
			System.out.println(attributeValue);
		}
		
		
	}

}
