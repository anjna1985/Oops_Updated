package inheritance;

public class BullDog extends Dog {
	
	
	public static void main(String[] args) {
		
		BullDog BD = new BullDog();
		BD.sound();
	
	}

}

// ********* Why multiple inheritance is not possible in Java *********
// when one child try to inherit property of two parent class 1 & parent 1 class
//lets say both class have sound class so its not possible to call.