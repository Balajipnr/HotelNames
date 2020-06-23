package collection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Driverpage {
	@Test
	public void driversetup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\java\\chrome driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.urbanladder.com/");
		driver.manage().window().maximize();
	
		
		PageFactory.initElements(driver, Datapage.class);
		
		Thread.sleep(7000);
		
		Datapage.close.click();
		Thread.sleep(7000);
		
		Datapage.collection.click();
		
		for(int i=0;i<5;i++) {
		System.out.println(Datapage.data.get(i).getText());
		}
	}
		
}
