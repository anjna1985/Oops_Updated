package testcases;

public class VariablesClass {

	
	//Instance variable / Local variables / Class variables
	
	
	// Instance & global variable - Declare in Class
	int i = 10;
	static int k = 20;  // Class variable it will change when user will change after creating object
	
	public void display ()
	{
		
		//Anything declare in method call local variable 
		int j = 10;
		
	}
	
	public void show ()
	{
		int i = 20; // I can change the value of global or instance variable in method 
		
		//int j = 10;	//but I cant change the value in another method and cant even access in another method.
		
	}
	
	
	public static void main(String[] args) {
		
			
		
	}

}
