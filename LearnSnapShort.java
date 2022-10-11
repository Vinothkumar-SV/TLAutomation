package assignment3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapShort {

	public static void main(String[] args) throws IOException {
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
				//take the snapshot
				File source = driver.getScreenshotAs(OutputType.FILE);
				//Create the physical file
				File destination =new File("./snaps/frame.png");
				//copy souce file to destination
				FileUtils.copyFile(source, destination);

	}

}
