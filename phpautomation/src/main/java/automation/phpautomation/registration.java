package automation.phpautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class registration {

	Properties prop=new Properties();
@Test
	

	public  void main() throws IOException {
		// TODO Auto-generated method stub
	base b1=new base();
	WebDriver driver= b1.getDriver();
		
		FileInputStream fis=new FileInputStream("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\my test project\\phpautomation\\src\\main\\java\\attribute.properties");
		prop.load(fis);
		
		
		
		driver.get(prop.getProperty("url"));
		//driver.manage().window().maximize();
		driver.findElement(b1.myaccount).click();
		driver.findElement(b1.signup).click();
		driver.findElement(b1.Firstname).sendKeys(prop.getProperty("Firstname"));
		driver.findElement(b1.Lastname).sendKeys(prop.getProperty("Lastname"));
		driver.findElement(b1.mobilenumber).sendKeys(prop.getProperty("mobilenumber"));
		driver.findElement(b1.Email).sendKeys(prop.getProperty("Email"));
		driver.findElement(b1.password).sendKeys(prop.getProperty("password"));
		driver.findElement(b1.confirm).sendKeys(prop.getProperty("confirm"));
		driver.findElement(By.xpath("//*[@id=\"cookyGotItBtn\"]")).click();
		driver.findElement(b1.submit).click();
		
	}
}


