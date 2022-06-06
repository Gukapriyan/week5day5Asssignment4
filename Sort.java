package week5.day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sort {
	
	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver=new ChromeDriver();

        driver.get("http://www.leafground.com/pages/sortable.html");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        

        List<WebElement> Item = driver.findElements(By.xpath("//div[@id='mydiv']//li"));
        WebElement Item2 = Item.get(1);
        WebElement Item5 = Item.get(4);
        
     
        Actions build=new Actions(driver);
        build.clickAndHold(Item2).moveToElement(Item5).release().perform();
        
       
	}


	
}