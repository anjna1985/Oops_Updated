package arrayClass;

public class ArrayLengthJavas {

	private static void printArrayLength(String[] myArray) {
		if (myArray == null) //to check whether the array is empty or not
		{
		System.out.println("The length of the array can't be determined.");
		} else {
		int arrayLength = myArray.length;
		System.out.println("The length of the array is: " + arrayLength);
		}
	}

	public static void main(String[] args) {
		String[] JavaArray1 = { "I", "Love", "Music" };
		String[] JavaArray2 = { "R", "S" };
		String[] JavaArray3 = { "1", "2", "3", "4" };
		String[] JavaArray4 = { "Java" };
		printArrayLength(null);
		printArrayLength(JavaArray1);
		printArrayLength(JavaArray2);
		printArrayLength(JavaArray3);
		printArrayLength(JavaArray4);

	}

}
