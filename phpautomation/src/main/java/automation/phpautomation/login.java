package automation.phpautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class login {
	Properties prop=new Properties();
	@Test
		

		public  void main() throws IOException {
			// TODO Auto-generated method stub
		base b1=new base();
		WebDriver driver= b1.getDriver();
			
			FileInputStream fis=new FileInputStream("C:\\Softwares\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\my test project\\phpautomation\\src\\main\\java\\attribute.properties");
			prop.load(fis);
			
			
			
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.findElement(b1.myaccount).click();
			driver.findElement(b1.login).click();
			driver.findElement(b1.Email1).sendKeys(prop.getProperty("Email1"));
			driver.findElement(b1.password1).sendKeys(prop.getProperty("password1"));
			driver.findElement(b1.login1).click();
			//driver.quit();
			
	

}
}