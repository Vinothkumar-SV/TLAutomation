package assignment3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnJquery {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("https://jqueryui.com/draggable/");
		//maxmize the window
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch to frame
		driver.switchTo().frame(0);
		//Locate the element
		WebElement drag = driver.findElement(By.id("draggable"));
		//handle the actions
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 100, 100);
		//Take snapshort
		//take the snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//Create the physical file
		File destination =new File("./jquery.png");
		//copy souce file to destination
		FileUtils.copyFile(source, destination);

	}

}
