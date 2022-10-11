package week1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Chennai'])[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Chrome'])[2]")).click();
		driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();

	}

}
