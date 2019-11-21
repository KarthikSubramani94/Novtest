package Jen.ks;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TTK {

	@Test
	public void ttes() {
		  System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://google.com");
	        driver.navigate().to("https://the-internet.herokuapp.com/");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
	        Set<String> s=driver.getWindowHandles();
	        Iterator<String> k=s.iterator();
	        
	        String parent=k.next();    
	        String child=k.next();  
	        driver.switchTo().window(child); 
	        System.out.println(driver.getTitle());
	        driver.close();
	}
}
