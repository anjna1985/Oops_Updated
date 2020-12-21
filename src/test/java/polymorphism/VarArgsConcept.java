package polymorphism;

public class VarArgsConcept {
	
	
	/*
	 * What is varargs in Java?
		Let’s suppose you are creating a Java method. However, you are not sure 
		how many arguments your method is going to accept. To address this problem, 
		Java 1.5 introduced varargs.

		Varargs is a short name for variable arguments. In Java, an argument of a method 
		can accept arbitrary number of values. This argument that can accept variable number 
		of values is called varargs.
		
		accessModifier methodName(datatype… arg) {
    	// method body
		}
	 */

	public int sumNumber(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum = x + sum;
            System.out.println("X value:"+x);
        }
        return sum;
	}
	
	public static void main(String[] args) {
		
		VarArgsConcept ex = new VarArgsConcept();
		 
	        int sum2 = ex.sumNumber(2, 4);
	        System.out.println("sum2 = " + sum2);
	        int sum3 = ex.sumNumber(1, 3, 5);
	        System.out.println("sum3 = " + sum3);
	        int sum4 = ex.sumNumber(1, 3, 5, 7);
	        System.out.println("sum4 = " + sum4);
	}
}
