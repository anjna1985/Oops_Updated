package testcases;

public class MethodStaticandnonstatic {

	// Static component - Can't give a call to non-static component directly.
	
	public static void main(String[] args) {

		MethodStaticandnonstatic ms = new MethodStaticandnonstatic();
		ms.go();
		ms.go2();
		go3();
		
//Directly Called - static - static
//Directly Called - non-static - non static, static component
		
		
	}

	public static void go() {

		System.out.println("Go inside Go Method");
		go1();
	}

	public static void go1() {

		System.out.println("Go inside Go 1 Method");
	}

	public void go2() { //non static method can directly called in static method

		System.out.println("Go inside Go 2 Method");
		go3();
	}
	
	public static void go3() {

		System.out.println("Go inside Go 3 Method");
		}
}

//So question is why can't we have everything static - to answer to this question is - if we keep all components static then we wont able to follow OOP concept like we wont able to use inheritance, abstraction etc.
