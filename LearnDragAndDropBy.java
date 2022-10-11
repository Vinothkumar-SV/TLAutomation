package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndDropBy {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Create obj for ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("http://www.leafground.com/pages/drag.html");
		//max my window
		driver.manage().window().maximize();
		//add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      WebElement drag = driver.findElement(By.id("draggable"));
      Point location = drag.getLocation();
      int x = location.getX();
      int y = location.getY();
      System.out.println("Xvalue"+x+ "Value of y"+ y);
      //Create object for Actions Class
        Actions builder=new Actions(driver);
        builder.dragAndDropBy(drag, 100, 50).perform();
	}

}
