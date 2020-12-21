package overriding;

public class Base {

	public Webdriver getBrowserInstance (String browserName) {
		
		if (browserName.equals("firefox")) {
			
			return new FireFoxDriver();
		} else if (browserName.equals("chrome")) {
			return new ChromeDriver();
		}else if (browserName.equals("ie")) {
			return new InternetExplorerDriver();
		}else {
			return new FireFoxDriver();
		}
	}
}
