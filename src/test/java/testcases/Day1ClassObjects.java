package testcases;

public class Day1ClassObjects {

	static Day1ClassObjects c;

	public static void main(String[] args) {

		/*
		 	for (int i = 0;; i++) {
			new Day1ClassObjects();
			System.out.println(i); 
		*/

			// Day1ClassObjects is object and many objects can be created for one class
			// JDK -> Java Compiler + JRE (JVM + Lib files) - To run java program, You need
			// JRE
			// Garbage Collection - > Clean out the heap so that new object can be created.
			// basically removing un-used objects.
			
			Day1ClassObjects d = new Day1ClassObjects();

			// Day1ClassObjects c;
			// c is reference variable
			
			System.out.println(c);
			System.out.println(d);
			
			//new Day1ClassObjects ();
			//d=null is eligible for garbage collection
			d=null;
			System.out.println(d);
	}

	}


