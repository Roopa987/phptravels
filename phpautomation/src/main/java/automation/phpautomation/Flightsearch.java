package automation.phpautomation;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Flightsearch {
By flight=By.xpath("//a[@href='#thflight']");
By fromlocation=By.xpath("//div[@id='s2id_origin']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
By fromlocation1=By.xpath("//div[@id='s2id_origin']//a[@class='select2-choice select2-default']");
By tolocation=By.xpath("//div[@id='s2id_destination']//span[@class='select2-chosen'][contains(text(),'Enter Location')]");
By tolocation1=By.xpath("//div[@id='s2id_destination']//a[@class='select2-choice select2-default']");
By oneway=By.xpath("//div[@class='tab-content shad RTL_shad search-form']//div[1]//div[1]//div[1]//ins[1]");
By departure=By.xpath("//input[@id='departure']");
By month=By.xpath("//div[16]//div[1]//tr[1]//th[2]");
By next=By.xpath("//div[16]//div[1]//tr[1]//th[3]");
By guests=By.xpath("//div[@class='col-md-1 form-group go-right col-xs-12']//input[@placeholder='0']");
By adults=By.xpath("//select[@id='madult']");
By child=By.xpath("//select[@id='mchildren']");
By infant=By.xpath("//select[@id='minfant']");
By search=By.xpath("//button[@class='btn-primary btn btn-lg btn-block pfb0']");
By submit=By.xpath("//button[@id='sumManualPassenger']");

public void tolocation(WebDriver driver) throws InterruptedException {
	driver.findElement(tolocation).click();
	driver.findElement(tolocation1).sendKeys("chenn");
	Thread.sleep(1000);
	driver.findElement(tolocation1).sendKeys(Keys.ENTER);
}

public void fromlocation(WebDriver driver) throws InterruptedException {
	driver.findElement(fromlocation).click();
	driver.findElement(fromlocation1).sendKeys("Del");
	Thread.sleep(1000);
	driver.findElement(fromlocation1).sendKeys(Keys.ENTER);
}

	public void departure(WebDriver driver,Properties prop) {
		driver.findElement(departure).click();
		String str=driver.findElement(month).getText();
		while(!str.equalsIgnoreCase(prop.getProperty("inmonth"))) {
			driver.findElement(next).click();
			str=driver.findElement(month).getText();
			
		}
		for(int i=1;i<=6;i++) {
    		for(int j=1;j<=7;j++) {
    			String str1=driver.findElement(By.xpath("//div[16]//tr["+i+"]//td["+j+"]")).getText();
    			if(str1.equals("1")) {
    				for(int k=i;k<=6;k++) {
    					for(int x=j;x<7;x++) {
    						String str2=driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+x+"]")).getText();
    						System.out.println(str2);
    						if(str2.equals(prop.getProperty("indate"))) {
    							driver.findElement(By.xpath("//div[16]//tr["+k+"]//td["+x+"]")).click();
    						}
    					}
    				}
    			}
    		}
    	}
    }	 
	
	public void guests(WebDriver driver,Properties prop) throws InterruptedException {
		driver.findElement(guests).click();
		driver.findElement(adults).click();
		Thread.sleep(1000);
		driver.findElement(adults).sendKeys(prop.getProperty("noofguests"));
		driver.findElement(By.xpath("//select[@id='madult']//option[contains(text(),'"+prop.getProperty("noofguests")+"')]")).click();
		
		driver.findElement(child).click();
		driver.findElement(child).sendKeys(prop.getProperty("noofguests"));
		driver.findElement(By.xpath("//select[@id='mchildren']//option[contains(text(),'"+prop.getProperty("noofguests")+"')]")).click();
		
		driver.findElement(infant).click();
		driver.findElement(submit).click();
	}
	}		








