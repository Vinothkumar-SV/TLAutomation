package assignment2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Create obj for ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("https://erail.in/");
		//max my window
		driver.manage().window().maximize();
		//add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Step:1-Launch the url (https://erail.in/)
			//Step:2-Enter From as MAS
		WebElement fromsta = driver.findElement(By.id("txtStationFrom"));
		fromsta.clear();
		fromsta.sendKeys("MAS",Keys.TAB);
		//Step:3-Enter To as MDU
		WebElement toSta = driver.findElement(By.id("txtStationTo"));
		toSta.clear();
		toSta.sendKeys("MDU");
		//Step:4-Uncheck sort on Date
		driver.findElement(By.id("chkSelectDateOnly")).click();
			//Step:5-Ensure whether there are duplicate train names
		 List<WebElement> tableRow = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		 int sizeRow = tableRow.size();
		 System.out.println(sizeRow);
		 
		 //Create one List
		 
		 List<String> lsttrain=new ArrayList<String>();
		 
		 //from row 
		 for (int i = 1; i < sizeRow; i++) {
			 String trainname = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
			 lsttrain.add(trainname);
		 }
		 
		 System.out.println(lsttrain);
		 //Remove duplicate
		 Set<String>removedup=new LinkedHashSet<String>(lsttrain);		 
		 int setsize = removedup.size();
		 System.out.println(setsize);
		 if(lsttrain.size()==removedup.size()) {
			 System.out.println("duplicate");//27 27
		 }
		 else {
			 System.out.println("No duplicate");
		 }//27 23
		 
		 
		 //Hint:use size() to check duplicate 
	}

}
