package overridingLesson;

public class CITI extends RBIOverRidding {

	//Parent is not able to fulfill the requirement hence will go with overriding
	
	public double getHomeLoanROI () {
		return 10.5;
	}
	
	
	public static void main(String[] args) {
		
		CITI c = new CITI();
		System.out.println(c.getHomeLoanROI());
		
		RBIOverRidding c1 = new CITI();
	//	CITI c1 = new RBIOverRidding(); // Not possible
		
		
	}

}
