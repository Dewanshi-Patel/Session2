package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}
	
	@Test
	public void testLocators() {
		
//		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();    to go back to the previous page. Comment it out. 
//		driver.findElement(By.partialLinkText("Product Backend")).click();
		
//		OR
		
//		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
//		driver.navigate().back();             to go back to the previous page
//		driver.findElement(By.partialLinkText("Product Backend")).click();
		driver.findElement(By.cssSelector("input#sex-1")).click();
		driver.findElement(By.cssSelector("input[type='radio'][id='exp-2']")).click();
		
		
//		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("1234");
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
//		driver.findElement(By.xpath("//input[@id='exp-2']")).click();
		
		
//		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys("Mike");
		
//		Link Text
//		driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click(); 
//		driver.findElement(By.xpath("//strong[contains text(),'Link Test : Page Change']")).click(); 
		driver.findElement(By.xpath("//input[@id='username']")).s
		
//		Dynamic Web Elements
		
		driver.findElement(By.xpath("//ul[@class= 'cn cn-list-hierarchical-xs cn--idx-0 cn-container_975CB60A-EC50-C053-9FE2-7B36E3099ACD']/descendant::li/descendant::a/descendant::h2")).click();
		driver.findElement(By.xpath("//ul[@class='cn cn-list-hierarchical-xs cn--idx-2 cn-container_337A68ED-DF5C-59D9-D145-230FEB7F134D']/descendant::li/descendant::div/descendant::h3/descendant::a/descendant::span")).click();
	
		
		
		
	}
	
	
	
	
	
}







