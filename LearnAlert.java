package assignment3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		//we have tocall WDM for browser driver
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("http://www.leafground.com/pages/Alert.html");
		//maxmize the window
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click on the Alert box
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		//switch into Alert
		Alert alert = driver.switchTo().alert();
	    //ctrl+2+l
	   //get text from alert box
	   String text = alert.getText();
	   System.out.println(text);
	   //click ok
	   alert.accept();
	   //confirm Alert
	   driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	   //Switch my Alert
	   Alert alert2 = driver.switchTo().alert();
	  //get the text
	   String text2 = alert2.getText();
	   System.out.println(text2 );
	   //click cancel
	   alert2.accept();
	   //check cancel button is pressed
	   String text3 = driver.findElement(By.id("result")).getText();
	   System.out.println(text3);
	   
	   //Click the prompt Alert
	   driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	   //switch to alert
	   Alert alert3 = driver.switchTo().alert();
	   //Get text
	   String text4 = alert3.getText();
	   System.out.println(text4);
	   
	   alert3.sendKeys("TestLeaf");
	   //click ok
	   alert3.accept();
   
	}

}
