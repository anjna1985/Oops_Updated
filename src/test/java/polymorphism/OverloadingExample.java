package polymorphism;

public class OverloadingExample {
	
	//Overloading 
	
	public static void main(String[] args) {
		
		OverloadingExample obj = new OverloadingExample ();
		obj.add(5,4);
		
		
	}

	public void add(int a, int b) {
		int c = a + b ;
		System.out.println("Adding:"+c);
		
	}
	
	public void add(int a, int b, int c) {
		
	}
	
}
