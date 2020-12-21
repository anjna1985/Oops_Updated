package overridingInterface;

	interface Mouse
	{
	void leftClick();
	void rightClick();
	void scroll();
	}
//Samsung mouse class override all methods of - interface and implement them	
public class ClassicMouse implements Mouse {
	
	public void leftClick() {		
		System.out.println("Left Click...");
	}

	public void rightClick() {	
		System.out.println("Righ Click...");
	}

	public void scroll() {		
		System.out.println("Scroll ...");

} }