package accessModifier3;

public class TestCase1 {

	public int publicVariable = 10;
	private	int privateVariable = 20;
	protected int protectedVariable = 30;
	int defaultVariable = 40;
	
	public static void main(String[] args) {
	
		TestCase1 TC1 = new TestCase1();
		System.out.println(TC1.publicVariable);
		System.out.println(TC1.privateVariable);
		System.out.println(TC1.protectedVariable);
		System.out.println(TC1.defaultVariable);
	}
	
}
