package accessModifier1;

import accessModifier3.TestCase1;

public class Sample1 extends TestCase1 {

	public static void main(String[] args) {
		
	//	TestCase1 TC1 = new TestCase1();
		Sample1 sam = new Sample1();
		System.out.println(sam.publicVariable);
		// System.out.println(TC1.privateVariable); Accessible in only their class
		System.out.println(sam.protectedVariable); // Can be access in diff but in same package. if you want to access then use inheritancce 
		//System.out.println(TC1.defaultVariable); // Can be access in diff but in same package

		//What is inheritance - One class object  will inherit other class properties.
		
	}

}
