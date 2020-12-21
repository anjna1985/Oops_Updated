package overridingCircle;

//interface
	interface Shape{
		void draw();
	}

public class Circle implements Shape {
	
	//class override draw() method and implement it
	public void draw() {		
	System.out.println("Circle...");
		}	
	}

