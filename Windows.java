package automate;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@type='button']//span[text()='Open']")).click();
		String main = driver.getWindowHandle();
		Set<String> st = driver.getWindowHandles();
		Iterator<String> itr = st.iterator();
		while (itr.hasNext()) {
			String child = itr.next();
			if (!main.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);

			}

		}

	}

}
