/*package Jen.ks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TT {

	@Test
	public void tte() {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeVersion\\chromedriver_win32_78\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.navigate().to("http://qaclickacademy.com/practice.php");

		driver.findElement(By.cssSelector("input#checkBoxOption2")).click();
		String option2 = driver.findElement(By.cssSelector("input#checkBoxOption2")).getAttribute("value");
		System.out.println(option2);

		Select drpDown = new Select(driver.findElement(By.id("dropdown-class-example")));
		drpDown.selectByValue(option2);

		driver.findElement(By.cssSelector("input#name")).sendKeys(option2);
		driver.findElement(By.cssSelector("input#alertbtn")).click();

		String text = driver.switchTo().alert().getText();
		boolean s = text.contains(option2);
		System.out.println(s);
		driver.switchTo().alert().accept();
	}
}
*/