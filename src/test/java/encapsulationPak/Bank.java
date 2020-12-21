package encapsulationPak;

public class Bank {

	public int accountNo = 123456;
	private int pinNo = 1234;
	private double balanceAmount = 1000000;

	public void withdrawAmount(int accNo, int pin, double amount) {

		if (accNo == accountNo && pin == pinNo) {
			if (amount <= balanceAmount) {

				balanceAmount = balanceAmount - amount;
				System.out.println("Amount withdral: " + amount);
				System.out.println("Remaining amount: " + balanceAmount);
			} else {
				System.out.println("Insufficent amount");
			}

		} else {
			System.out.println("Please try again. Invalid Credentials");
		}
	}

	public void updatePin(int accNo, int oldPin, int newPin) {

		if (accNo == accountNo && oldPin == pinNo) {

			pinNo = newPin;
			System.out.println("Pin sucessfully updated");

		} else {
			System.out.println("Invalid Credential. Can't update pin");
		}

	}

	/*public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	*/
	public double depositAmount(int accNo, int pin, double amount) {

		if (accNo == accountNo && pin == pinNo) {
			balanceAmount = balanceAmount + amount;
			return balanceAmount;
			// System.out.println("");
		} else {
			System.out.println("Invalid Credentials");
			return balanceAmount;
		}

	}

	public static void main(String[] args) {

		// Encapsulation - data fusion / wrapping data and methods in single unit
		// data hiding - hiding data from outside world so that they are not directly
		// accessible
		// Abstraction - to access outside of the class / for calling those (private)
		// variables using method / to access private member we use method
		// in Abstraction - Always create method public and variable private

	}

}
