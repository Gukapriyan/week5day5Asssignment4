package week5.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	
	

		public static void main(String[] args) {
			
	        WebDriverManager.chromedriver().setup();
	       
	        ChromeDriver driver=new ChromeDriver();
	        
	        driver.get("http://www.leafground.com/pages/table.html ");
	        
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	        
	        List<WebElement> row = driver.findElements(By.xpath("//div[@id='contentblock']//table//tr//td[2]"));
	        int size = row.size();
	        System.out.println("Number of Rows :"+" "+ size);
	        
	        
	        List<WebElement> Column = driver.findElements(By.xpath("//div[@id='contentblock']//table//th"));
	        int size2 = Column.size();
	        System.out.println("Number of Column :"+" "+ size2);
	        System.out.println("********************************");
	        
	       
	        System.out.println("Get the progress value of 'Learn to interact with Elements'");
	        for (int i = 1; i <size; i++) {
	        	String text = row.get(i).getText();
	        	System.out.println(text);
				}
	        System.out.println("************************************");
	        
	        
	        driver.findElement(By.xpath("//div[@id='contentblock']//table//tr[6]//td[3]")).click();
	        System.out.println("Least completed progress value is checked");
		}
		

	
}
