package automation.phpautomation;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testhotelsearch {
@Test
public void Hotelsearch() throws InterruptedException, IOException {
	Launch l=new Launch();
	Hotelsearch h1=new Hotelsearch();
	Properties prop=l.pro();
	WebDriver driver=l.getDriver();
	driver.get(prop.getProperty("url"));
	driver.findElement(h1.name).click();
	driver.findElement(h1.name).sendKeys(prop.getProperty("hotelname"));
	Thread.sleep(1000);
	driver.findElement(h1.name).sendKeys(Keys.ENTER);
	h1.checkin(driver,prop);
	h1.checkout(driver,prop);
	h1.noOfguests(driver,prop);
	driver.findElement(h1.search).click();
	
	
}
}
