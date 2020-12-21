package overridingFather;

public class Child extends Father {

	@Override
	public void car() {
	System.out.println("Son's Car");		
	}	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.home();
		c.car();

	}

}
