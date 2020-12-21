package overriding;

public class FireFoxDriver extends Webdriver {
	
	public void click() {
		
		System.out.println("Clicking in FF");
		
	}                   
	                    
                        
	public void sendKeys() {
	
		System.out.println("Typing in FF");
	
	}
}
