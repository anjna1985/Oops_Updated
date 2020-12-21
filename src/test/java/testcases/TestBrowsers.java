package testcases;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBrowsers {

	public static void main(String[] args) {
		
	
		/*
		Firefox Driver Configuration ----  
		System.setProperty("webdriver.gecko.driver","C:\\eclipse-workspace\\Software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://way2automation.com");
		*/
		
		
		//ChromeDriver Configuration -----
		//System.setProperty("webdriver.chrome.driver","C:\\eclipse-workspace\\Software\\chromedriver_win64\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com");
		
		
		/* IE Browser Setting */
		
		//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		/*System.setProperty("webdriver.ie.driver","C:\\eclipse-workspace\\Software\\IEDriverServer_Win32_3.8.0\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://way2automation.com");
		*/
		
	  /*ctrl+shift+o for importing all class
	    ctrl+shift+ (+, -) for changing font size
			
		latest selenium jar file
		latest browser version
		latest browser executable file
	*/
	
		
	}
	

}
