package automate;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("infinix",Keys.ENTER);
		String text = driver.findElement(By.xpath("//div[@class='_4rR01T']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//div[text()='BOZTI Back Cover for Infinix Note 12']")).click();
		System.out.println(driver.getTitle());
		
		String main = driver.getWindowHandle();
		Set<String> st = driver.getWindowHandles();
		Iterator<String> itr = st.iterator();
		while (itr.hasNext()) {
			String child = itr.next();
			if (!main.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);

			}

		}

        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
        driver.findElement(By.xpath("//button[text()='Enter Delivery Pincode']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys("621306");
        driver.findElement(By.xpath("//div[text()='Submit']")).click();
        
        
		/*
		 * driver.switchTo().window(lstwindowHandles.get(1));
		 * System.out.println(driver.getTitle()); driver.close();
		 * driver.switchTo().window(lstwindowHandles.get(0));
		 * System.out.println(driver.getTitle());
		 */
		
		
	}

}
