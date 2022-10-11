package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnKeyboardAction {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Create obj for ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("http://www.leafground.com/pages/selectable.html");
		//max my window
		driver.manage().window().maximize();
		//add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	    WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	    WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));
	    WebElement item7 = driver.findElement(By.xpath("//li[text()='Item 7']"));
	// perform the Action
	    Actions builder=new Actions(driver);
	    builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5)
	    .click(item7).keyUp(Keys.CONTROL).perform();
	}

}
