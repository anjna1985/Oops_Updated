package accessModifier3;

public class Sample {

	public static void main(String[] args) {
		
		TestCase1 TC1 = new TestCase1();
		
		System.out.println(TC1.publicVariable);
		// System.out.println(TC1.privateVariable); Accessible in only their class
		System.out.println(TC1.protectedVariable);
		System.out.println(TC1.defaultVariable);

	}

}
