package assignment3;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shadowdom {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		/*
		 * driver.get("https://dev111668.service-now.com/");
		 * 
		 * driver.findElement(By.id("user_name")).sendKeys("admin");
		 * driver.findElement(By.id("user_password")).sendKeys("India@123");
		 * driver.findElement(By.id("sysverb_login")).click();
		 */

		Thread.sleep(10000);
		// Shadow shadow = new Shadow(driver);

		/*
		 * shadow.findElementByXPath("//input[@id='sncwsgs-typeahead-input']").sendKeys(
		 * "Incident");
		 * 
		 * WebElement eleFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		 * 
		 * driver.switchTo().frame(eleFrame);
		 * 
		 * boolean displayed =
		 * shadow.findElementByXPath("//div[text()='Build apps fast.']").isDisplayed();
		 * 
		 * System.out.println(displayed);
		 */
		// driver.quit();

		driver.get("https://developer.servicenow.com/dev.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	io.github.sukgu.Shadow shadow = new io.github.sukgu.Shadow(driver);

	//	shadow.findElementByXPath("//span[text()='Sign In']").click();

		// String attribute =
		// shadow.findElement("downloads-toolbar").getAttribute("id");
		// System.out.println(attribute);

	}

}
