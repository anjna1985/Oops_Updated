package overriding;

public class InternetExplorerDriver extends Webdriver {
	
	public void click() {
		
		System.out.println("Clicking in IE");
		
	}                   
	                    
                        
	public void sendKeys() {
	
		System.out.println("Typing in IE");
	
	}

}
