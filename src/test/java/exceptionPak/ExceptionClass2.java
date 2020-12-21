package exceptionPak;

public class ExceptionClass2 {

	public static void main(String[] args) {
		
		//final int x = 10; diff b/w final and finally
		//x = 20;
		
		try {
		//int i[] = new int [4];
		//i[5]=1000;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Occured");
		} finally {
			System.out.println("Its now done");
			
		}

	}

}
