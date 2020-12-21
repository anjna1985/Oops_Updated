package polymorphism;

public class ReturnOverloadingConcept {
	
	public static void main(String[] args) {
		
	ReturnOverloadingConcept roc = new ReturnOverloadingConcept();
	//roc.add(1, 2);
	System.out.println(roc.add(1, 2));
	}

	public int add(int a, int b) {
	int c = a + b;
	System.out.println("Adding:"+c);
	return 10;
	}
		
	public int add(int a, int b, int c) {
		
			
	return 10;
	}
	
	/*public void add(int a, int b, int c) { -----> not possible
	  return 10;
	}
	*/
	
}
