package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Create obj for ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("http://www.leafground.com/pages/drop.html");
		//max my window
		driver.manage().window().maximize();
		//add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions builder =new Actions(driver);
        builder.dragAndDrop(drag, drop).perform();
       
       
       
       
       
       
       
       
       
       
       
	}

}
