package accessModifier1;

public class TestCase {

	public static void main(String[] args) {
		
		ModifierClass1 MDC1 = new ModifierClass1 (); //Public Class within same package
		MDC1.add(10,5);
		System.out.println(MDC1.add(10,5));
		
		ModifierClass2 MFC2 = new ModifierClass2(); // Default Class within same package
		MFC2.show();
				
		

	}

}
