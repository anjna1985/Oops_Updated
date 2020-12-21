package polymorphism;

public class RBI {
	
	//Overloading Concept

	public void getHomeLoanROI(String bankName) {
		
	}
	
	public void getHomeLoanROI(String bankName, int amount) {
		
	}
	
	public void getHomeLoanROI(String bankName, String branchName) {
	
	}
	
	//I can change the seq.
	public void getHomeLoanROI(int amount, String bankName) {
		
	}
	
}
