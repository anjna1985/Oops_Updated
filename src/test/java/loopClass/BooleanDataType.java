package loopClass;

public class BooleanDataType {

	public static void main(String[] args) {

		// boolean bol = true;
		System.out.println(10 < 20);

		int first_no = 30;
		int sec_no = 20;
		int third_no = 20;

		boolean result = first_no > sec_no;
		System.out.println(result);

		if (first_no > sec_no && first_no > third_no) {
			System.out.println("First number is greater then second & third number");
		} else if (sec_no > first_no && sec_no > third_no) {
			System.out.println("Second number is grater than first & third number");
		} else {
			System.out.println("third number is grater then first & second number");
		}

	}
}
