package encapsulationPak; 

public class ATM {

	public static void main(String[] args) {
		
		Bank obj = new Bank ();
		//obj.pinNo = 2222;
		
		obj.withdrawAmount(123456, 1234, 10000); //With Valid Pin
		obj.updatePin(123456, 1234, 2222); //Updating Pin
		obj.withdrawAmount(123456, 1234, 10000);
		obj.withdrawAmount(123456, 2222, 10000);
		System.out.println(obj.depositAmount(123456, 2222, 50000));
		//obj.withdrawAmount(123456, 12345, 1000); // With Invalid Pin
		//obj.withdrawAmount(123456, 1234, 1000000); //More amount - Insufficent amount
		//obj.withdrawAmount(123456, 2222, 1000);
		// This all is security break 
	
		
		
		
	} 

}
