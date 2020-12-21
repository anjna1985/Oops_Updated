package inheritance;

public class Dog extends Animal {
	
	
	public static void main(String[] args) {
	
		Dog d = new Dog();
		d.sound();
		
	}

	public void sound() { //This will called 1st if we have same method in one class
		System.out.println("Whow Whow");
	}


}
