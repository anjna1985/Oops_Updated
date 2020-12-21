package testcases;

public class Calculator {

	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}

	public int mul(int a, int b) { //Paramenter 
		int mul = a * b;
		return mul;
	}

	public int div(int a, int b) {
		int div = a / b;
		return div;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Addition: " +c.add(10, 20)); //Arguments are the values which are passed during calling of a method. These arguments are stored in the parameters of the method.
		System.out.println("Subtraction: "+c.sub(20, 10));
		System.out.println("Multiplcation: "+c.mul(20, 10));
		System.out.println("Division: "+c.div(20, 10));
	}

}
