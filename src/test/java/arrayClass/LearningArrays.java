package arrayClass;

public class LearningArrays {

	public static void main(String[] args) {
		
		int emp1 = 5000;
		int emp2 = 6000;
		
		int emp10 = 1000;
		
		int[] salary;
		
		salary = new int[10];
		
		String month[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
				
		for (int i=0;i<month.length;i++)

		{
			System.out.println("Month : " +month[i]);
						
		}
      //-----------------------------------------------------
		int a [];//Create Array
		a = new int [3]; //Define Size
		a[0]=10;
		a[1]=20;
		a[2]=30;

		System.out.println(a[0] + a [1]);//30
		System.out.println(a[2]);//30
	
	//----------------------------------------------------
		int b [];//Create Array
		b = new int [4]; //Define Size
		b[0]=10;
		b[2]=30;

		System.out.println(b[0] + b[2]);//30
	
	//----------------------------------------------------
		int [] array1 = {1, 2, 3, 4, 5};

		System.out.println(array1.length);//5

		for (int i=0; i < array1.length; i++){
		System.out.println(array1[i]);
	
		}
	
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
