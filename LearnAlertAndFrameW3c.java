package assignment3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertAndFrameW3c {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//maxmize the window
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch the frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//switch the alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//GetText
		WebElement text = driver.findElement(By.id("demo"));
		String text2 = text.getText();
		//verification
		if(text2.contains("Cancel")) {
			System.out.println("correct Result");
		}
		else {
			System.out.println("Wrong Result");
		}

	}

}
