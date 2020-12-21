package overridingLesson;

public class HSBC extends RBIOverRidding {

	public double getHomeLoanROI () {
		return 12.5; //Can't change the return type while overriding.
	}
	
	
	public AMEX getObject ()
	{
		AMEX h = new AMEX();
		return h;
	}
	
	public static void main(String[] args) {
		
		HSBC h = new HSBC();
		System.out.println(h.getHomeLoanROI());
}
}
