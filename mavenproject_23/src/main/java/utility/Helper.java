package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helper {
	

	public static void hoverOver( WebDriver driver, WebElement element) {
		
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}
}
