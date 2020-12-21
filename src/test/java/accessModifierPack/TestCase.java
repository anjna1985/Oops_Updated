package accessModifierPack;

import accessModifier1.ModifierClass1;

public class TestCase {

	public static void main(String[] args) {
		
		ModifierClass1 MDC1 = new ModifierClass1 (); //Public Class within same package
		MDC1.add(10,5);
		System.out.println(MDC1.add(10,5));
		
	//	ModifierClass2 MFC2 = new ModifierClass2(); // Default Class within same package. If its outside of package then wont be accessible
	//	MFC2.show();
				
		

	}

}
