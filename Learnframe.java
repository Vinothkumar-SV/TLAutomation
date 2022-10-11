package assignment3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnframe {

	public static void main(String[] args) {
		//we have tocall WDM for browser driver
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("http://www.leafground.com/pages/frame.html");
		//maxmize the window
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Switch the frame
		driver.switchTo().frame(0);
		//Click the button
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		//getText the message
		System.out.println(frame1.getText());
		//come out of all frame
		driver.switchTo().defaultContent();
		//handle the second frame(nested frame)
		//switch the control
		//switch to parent frame/main frame
		WebElement parentframe = driver.findElement(By.xpath("//iframe[@src='page.html']"));
		driver.switchTo().frame(parentframe);//frame by WebElement
		//switch the control to child frame
		driver.switchTo().frame("frame2");//frame by id or name
		WebElement secondFrame = driver.findElement(By.id("Click1"));
		secondFrame.click();
		//get the text
		System.out.println(secondFrame.getText());
		driver.switchTo().parentFrame();//parent frame

	}

}
