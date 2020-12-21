package arrayClass;

public class ArrayLengths {

	public static void main(String[] args) {
		
		int[] primes = {2, 3, 5, 7, 11};

		// looping over array using for loop
		for(int i =0; i< primes.length; i++){
		System.out.printf("element at index %d is %d %n", i, primes[i]);
		}

		// iterating over array using enhanced for loop
		for(int prime : primes){
		System.out.println("current number is " + prime);
		}

	}

}
