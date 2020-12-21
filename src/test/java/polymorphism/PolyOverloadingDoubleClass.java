package polymorphism;

public class PolyOverloadingDoubleClass {
	
	//We can overload main as well but can we achieve with diff parameter
	
	public static void main(String[] args) {
		
		PolyOverloadingDoubleClass pldc = new PolyOverloadingDoubleClass();
		//pldc.add(10, 20); //The method add(int, double) is ambiguous for the type PolyOverloadingDoubleClass
		
	}

	public void add (int a, double b) {
	System.out.println("Method with a int and b double");	
		
	}
	
	public void add(double a, int b) {
		System.out.println("Method with a double and b int");	
	
	}
}
