package week1.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinks {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[1]")).click();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']")).click();
		driver.findElement(By.xpath("//span[text()='New']")).click();
		driver.findElement(By.xpath("//input[@id='form:name']")).sendKeys("Rudhratcham");
		driver.findElement(By.xpath("//textarea[@id='form:description']")).sendKeys("For Divine Purpose");
		driver.findElement(By.xpath("//label[text()='Accessories']")).click();
		WebElement price = driver.findElement(By.xpath("//input[@id='form:price_input']"));
		price.click();

		price.clear();
		price.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, "44");

		WebElement quantity = driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']"));
		quantity.click();
		quantity.click();
		quantity.click();

		driver.findElement(By.xpath("//span[text()='Save']")).click();
		TakesScreenshot screen = ((TakesScreenshot)driver);
		File src = screen.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("./data/alertSnap.jpg"));
		System.out.println("Success");
	}
}
