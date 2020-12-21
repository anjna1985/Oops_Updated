package polymorphism;

public class PolyByteOverloading {

	public static void main(String[] args) {
		
		PolyByteOverloading pol = new PolyByteOverloading();
		
		pol.add(10, 20); //If user will not specify the byte then it will call method with int parameter
		
		byte b1=40;
		byte b2=50;
		
		pol.add(b1, b2); //if specify the byte in method as parameter then method will call with byte type
		
	}
	
	
	public void add (int a, int b) {
		System.out.println("Callig method with int");
	}
	
	public void add (byte a, byte b) {
		System.out.println("Callig method with byte");
	}
	
}
