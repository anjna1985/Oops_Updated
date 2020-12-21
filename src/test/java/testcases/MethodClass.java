package testcases;

public class MethodClass {

	
	public void display () 
	{
		//DECLARE METHOD LIKE DECLARE VARIABLE (INT I;) AFTER DECLARE THE METHOD, NEED TO DEFINE METHOD
		//All definitions will come here
		//Whenever we are using data type then need to use return keyword
		//if not returning anything then method should be void
	}
	
	public int display0 () 
	{
		//Whenever we are using data type then need to use return keyword
		int x=10; //This should be same as method data type;
		return x; //last statement - If method is returning integer then return type should be integer
	}
	
	public String displayS() 
	{
		//Whenever we are using data type then need to use return keyword
		String y="Bharat"; //This should be same as method data type;
		return y; //last statement - If method is returning integer then return type should be integer
	}
	public static void main(String[] args) {
		//Main is also kind of method
		System.out.println("Hi How are you");
		// Method is just for reusing code multiple time.
		
		/*
		Access / Non Access Modifier
		return type
		Method name
				*/
		VariablesClass v = new VariablesClass ();
		
		System.out.println("Non Static (Class) Variable: Diff Object -"+v.i++);
		System.out.println("Static (Class) Variable: Diff Object -"+v.k++);
		System.out.println("Static (Class) Variable: Diff Object -"+v.k);
		
		VariablesClass v1 = new VariablesClass ();
		System.out.println("Non Static (Class) Variable: Diff Object -"+v1.i++);
		System.out.println("Static (Class) Variable: Diff Object -"+v1.k++);
		System.out.println("Static (Class) Variable: Diff Object -"+v1.k);
		
		VariablesClass v2 = new VariablesClass ();
		System.out.println("Non-Static (Class) Variable: Diff Object -"+v2.i);
		System.out.println("Static (Class) Variable: Diff Object -"+v2.k);
		//Class variable
		
		
	}
}
