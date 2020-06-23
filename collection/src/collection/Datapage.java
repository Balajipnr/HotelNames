package collection;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Datapage {
	
	@FindBy(xpath="//*[@class='close-reveal-modal hide-mobile']")
	public static WebElement close;
	//*[@class='topnav_itemname active']
	//*[text()='Collections']
	
	@FindBy(xpath = "//*[@id=\'topnav_wrapper\']/ul/li[10]/span")
	public static WebElement collection;
	
	@FindBy(xpath = "//*[@id=\'topnav_wrapper\']/ul/li[10]/div/div/ul/li")
	public static List<WebElement> data;
}
