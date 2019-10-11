package automation.phpautomation;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testflightsearch {
	@Test
	public void Flightsearch() throws IOException, InterruptedException {
		Launch l=new Launch();
		Flightsearch fs=new Flightsearch();
		Properties prop=l.pro();
		WebDriver driver=l.getDriver();
		driver.get(prop.getProperty("url"));
		driver.findElement(fs.flight).click();
		fs.tolocation(driver);
		fs.fromlocation(driver);
		fs.departure(driver,prop);
		driver.findElement(fs.oneway).click();
		fs.guests(driver,prop);
		driver.findElement(fs.submit).click();
		driver.findElement(fs.search).click();
		
	}

}
