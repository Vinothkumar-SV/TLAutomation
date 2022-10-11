package assignment3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleAssignment {

	public static void main(String[] args) throws InterruptedException {
		//we have tocall WDM for browser driver
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("https://www.irctc.co.in/");
		//maxmize the window
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(2000);
		//handle the sweet alert
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		//get the title
		System.out.println(driver.getTitle());
		String title1 = driver.getTitle();
		//click Fligts
		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')] ")).click();
		//Handle the window
		Set<String> windowHandles = driver.getWindowHandles();
		//convert set into list
		List<String> lstwindowHandles=new ArrayList<String>(windowHandles);
		//switch the control to corresponding window
		driver.switchTo().window(lstwindowHandles.get(1));
		String title2 = driver.getTitle();
		System.out.println(driver.getTitle());
		if(title1.equals(title2)) {
			System.out.println("same window");
		}
		else {
			System.out.println("different window");
		}

	}

}
