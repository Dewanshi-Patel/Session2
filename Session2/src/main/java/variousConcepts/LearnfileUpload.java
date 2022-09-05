package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnfileUpload {

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
			public void fileUpload() {
		
			driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\drpra\\Desktop\\Immediate Implant Residency.pptx");
		
		
		
	}
	
}
