package assignmentreview;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/frame.xhtml");
	driver.manage().window().maximize();
	
	// Switching the context inside a frame
	 List<WebElement> f = driver.findElements(By.tagName("iframe"));
     System.out.println("Total number " + f.size());
	 WebElement element = driver.findElement(By.tagName("iframe"));
     element.getSize(); 
	
}
}
