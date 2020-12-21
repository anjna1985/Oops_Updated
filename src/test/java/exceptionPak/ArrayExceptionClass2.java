package exceptionPak;

public class ArrayExceptionClass2 {

	public static void main(String[] args) {
		
		System.out.println("Beginning");
		try {
		 int i[] = new int [4];
		 i[6]=100;
		 System.out.println(i[5]);
		} catch (Exception e) {
			System.out.println("Error Occured Just now");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Ending");

	}

}
