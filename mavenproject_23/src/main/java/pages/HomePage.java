package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Helper;

public class HomePage {
WebDriver driver;
	
	public HomePage(WebDriver x) {
		 driver = x;
	}
	
	public void hoverOveronMenMenue() {
		Helper.hoverOver(driver, driver.findElement(By.xpath("xpath of men menu")) );
	}
}
