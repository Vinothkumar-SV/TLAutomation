package assignment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebtable {

	public static void main(String[] args) {
		//set the path
				WebDriverManager.chromedriver().setup();
				//Create obj for ChromeDriver
				ChromeDriver driver=new ChromeDriver();
				//Load the url
				driver.get("http://www.leafground.com/pages/table.html");
				//max my window
				driver.manage().window().maximize();
				//add the wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
              
				WebElement rowTag = driver.findElement(By.tagName("tr"));
	              String text = rowTag.getText();
	              System.out.println(text);
	             String header = driver.findElement(By.tagName("th")).getText();
	              System.out.println(header);
	              //get Size of row
	              List<WebElement> row = driver.findElements(By.xpath("//table//tr"));
	              int rowsize = row.size();
	              System.out.println(rowsize);
	              //get the size of coloumn
	              List<WebElement> colCount = driver.findElements(By.xpath("//table//th"));
	              int size2 = colCount.size();
	              System.out.println(size2);
	              //dynamic xpath
	              for (int i =2; i <=4 ; i++) {
					
	              List<WebElement> colSize = driver.findElements(By.xpath("//table//tr["+i+"]/td"));
	              int coloumnsize = colSize.size();
	          
	              //System.out.println(coloumnsize);
	              for (int j =1; j <coloumnsize ; j++) {
	            	  String text2 = driver.findElement(By.xpath("//table//tr["+i+"]/td["+j+"]")).getText();
					   System.out.println(text2);
	              
	              }
	              //print the prograss value of learn to locator
	              System.out.println(row.get(i).getText());
	              }
			
					
	              }
	              
	
}

