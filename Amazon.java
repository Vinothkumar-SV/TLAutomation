package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='RESULTS']")).getText();
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy S20 FE 5G"
				+ " (Cloud Navy, 8GB RAM, 128GB Storage) with No Cost EMI & Additional Exchange Offers']")).click();
		Set<String> windowHandles = driver.getWindowHandles();//ctrl+2+l
		System.out.println("How many window open"+windowHandles.size());
		List<String>lstWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(lstWindow.get(2));
		String st = driver.findElement(By.xpath("(//span[@id='acrCustomerReviewText'])[2]")).getText();
		System.out.println(st);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("(//i[@class='a-icon a-icon-star a-star-4-5'])[1]"))).build().perform();
		Actions ac2 = new Actions(driver);
		ac2.click();
		
		
		driver.findElement(By.xpath("(//span[text()='4.4 out of 5'])[3]"));
		
		
		
		
		
	}
}
