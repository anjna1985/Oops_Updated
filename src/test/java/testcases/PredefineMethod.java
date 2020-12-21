package testcases;

public class PredefineMethod {

	public static void main(String[] args) {
		double x = 28;
		double y = 4;

		// For static method, We dont need to create object

		// return the maximum of two numbers
		System.out.println("Maximum number of x and y is: " + Math.max(x, y));

		// type casting - Conversion

		System.out.println(Math.random() * 10);
		System.out.println(Math.random() * 100);

		// Type Casting
		double doc = Math.random();
		System.out.println(doc);

		int in = (int) (Math.random() * 100);
		System.out.println(in);

		int ini = (int) (Math.random() * 5);
		System.out.println(ini);
	}

}
