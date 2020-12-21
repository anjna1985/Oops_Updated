package overriding;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 extends Base {
	
	String browserName = "chrome";
	
	public void intiBrowser () {
		
		Webdriver driver = getBrowserInstance (browserName);
		driver.click();
		driver.sendKeys();
		driver.getTitle();
	}
	
	public static void main(String[] args) { //Overriding things for diff browser
		
		TestCase1 tc = new TestCase1 ();
		tc.intiBrowser();
				
		/*	ChromeDriver driver = new ChromeDriver ();
		driver.click();
		driver.sendKeys();
		driver.getTitle(); */
		
		
		
		
	}

}
