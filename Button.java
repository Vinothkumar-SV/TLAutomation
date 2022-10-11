package week1.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//button[@role='button']//span[text()='Click']")).click();
		driver.navigate().to("https://www.leafground.com/button.xhtml");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.textToBe("xpath, Did you notice?"));
		WebElement disable = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']"));
		String text = disable.getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//button[@role='button']//span[text()='Submit'])[1]")).click();
		driver.findElement(By.xpath("//button[@type='button']//span[text()='Save']")).click();
		driver.findElement(By.xpath("(//button[@type='button']//span[text()='Submit'])[2]")).click();
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("(//button[@type='button']//span[text()='Success'])[1]"))).build()
				.perform();
		TakesScreenshot screen = ((TakesScreenshot) driver);
		File src = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(
				"C:\\Users\\Admin\\OneDrive - TestLeaf Software Solutions Private Limited\\VINOTH\\Automation\\Seleiumprojects\\Screenshot\\mouseover.png"));

		driver.findElement(By.xpath("//button[@type='button']//span[text()='Image']"));
		Actions img = new Actions(driver);
		img.click(driver.findElement(By.xpath("//button[@type='button']//span[text()='Image']"))).build().perform();
		TakesScreenshot shot = ((TakesScreenshot) driver);
		File inp = shot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(inp, new File(
				"C:\\Users\\Admin\\OneDrive - TestLeaf Software Solutions Private Limited\\VINOTH\\Automation\\Seleiumprojects\\Screenshot\\button.png"));
		WebElement image = driver.findElement(By.xpath("//h5[text()='Click Image Button and Click on any hidden button']"));
		String imt = image.getText();
		System.out.println(imt);
		//https://www.leafground.com/waits.xhtml
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/IMG001.png");
		FileUtils.copyFile(source, dest);
			
		
	}

}
