package automation.phpautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	//registration page
	
	By submit =By.xpath("//button[@class='signupbtn btn_full btn btn-action btn-block btn-lg']");
    By  myaccount = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//a[@class='dropdown-toggle go-text-right'][contains(text(),'My Account')]");
    By signup = By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Sign Up')]");
    By Firstname = By.xpath("//input[@placeholder='First Name']");
    By Lastname=By.xpath("//input[@placeholder='Last Name']");
    By mobilenumber=By.xpath("//input[@placeholder='Mobile Number']");
    By Email=By.xpath("//input[@placeholder='Email']");
    By password=By.xpath("//input[@placeholder='Password']");
    By confirm=By.xpath("//input[@placeholder='Confirm Password']");
    //login page
    By login= By.xpath("//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left user_menu']//li[@id='li_myaccount']//ul[@class='dropdown-menu']//li//a[@class='go-text-right'][contains(text(),'Login')]");
    By Email1=By.xpath("//input[@placeholder='Email']");
   By password1=By.xpath("//input[@placeholder='Password']");
    By login1= By.xpath("//button[@class='btn btn-action btn-lg btn-block loginbtn']");
    WebDriver driver;
    //Tour page
    By tour=By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[3]/a");
    By Destination=	By.xpath("/html/body/div[6]/section/div[2]/div/div/div[2]/div[1]/div[1]/form/div[1]/div/div/div[2]/a/span[1]");
    By drp=By.xpath("//div[contains(text(),'Big Bus Tour of Dubai')]");
    //hotel page
    By hotellink=By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[1]/a");
	By search=By.xpath("//span[contains(text(),'Search by Hotel or City Name')]");
	By city=By.xpath("//div[@id='s2id_location']//a[@class='select2-choice select2-default']");
	By select=By.xpath("//div[contains(text(),'alore, India')]");
	By check_in=By.xpath("//div[@id='dpd1']//input[@placeholder='Check in']");
	By Next=By.xpath("//div[14]//div[1]//tr[1]//th[3]");
	By check_out=By.xpath("//input[contains(@placeholder,'Check out')]");
	By Next1=By.xpath("//div[15]//div[1]//tr[1]//th[3]");
	
	
	
	
	//By move=By.xpath("//div[14]//div[1]//tr[1]//th[3]");
	//By date=By.xpath("//div[14]//tr[3]//td[4]");
	
	
	
	//flight page
	By flightlink=By.xpath("//*[@id=\"body-section\"]/section/div[2]/div/div/div[2]/ul/li[2]/a");
	By search1=By.xpath("//div[@id='select2-drop']//input[@class='select2-input']");
	//By city=By.xpath("//div[@id='select2-drop']//input[@
	
    		
    		
    		
    public base() {
    	System.setProperty("webdriver.chrome.driver","C:\\r\\chromedriver.exe");
    	WebDriver  driver =new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	this.driver=driver;
    }
    public WebDriver getDriver() {
    	return driver;
    	}
	

	
	

}
