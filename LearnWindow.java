package assignment3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindow {

	public static void main(String[] args) {
		//we have tocall WDM for browser driver
				WebDriverManager.chromedriver().setup();
				//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				//Load the url
				driver.get("http://www.leafground.com/pages/Window.html");
				//maxmize the window
				driver.manage().window().maximize();
				//wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				System.out.println(driver.getTitle());//current window title
				String windowHandle = driver.getWindowHandle();
	              System.out.println(windowHandle);
	              //click the home page button
	              driver.findElement(By.id("home")).click();
	              //to checkby title
	              System.out.println(driver.getTitle());
	              //How can i know the second window
	              Set<String> windowHandles = driver.getWindowHandles();
	              System.out.println(windowHandles.size());
				 //How can i get second window
	              //create list
	              //convert set into list passing the set name as arg into list
	              List<String> lstwindowHandles=new ArrayList<String>(windowHandles);
	              String secondWindow = lstwindowHandles.get(1);
	              System.out.println(secondWindow);
	              //To move the control to  second
	              driver.switchTo().window(lstwindowHandles.get(1));
	              //print the title
	              System.out.println(driver.getTitle());
	              //close the new window
	              driver.close();
	              //move back to main window
	              driver.switchTo().window(lstwindowHandles.get(0));
	              System.out.println(driver.getTitle());
	              //close the new window
	              //to close all the open window
	             // driver.quit();
	             
				
				
	}

}
