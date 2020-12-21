package polymorphism;

public class FacebookOverloadingConcept {

	public static void main(String[] args) {
		FacebookOverloadingConcept foc = new FacebookOverloadingConcept ();
		//foc.doLogin(9503650232l, "India");
		foc.doLogin("anjna85", "India");
	}
	
	//Initially FB has functionality to login into FB account using mobile & password
	//Later the implemented to login using user id & password and it achieved using overloading. See how
	
	public void doLogin (long mobile, String password) {
		System.out.println("Sucefully logged in with mobile number");
	}
	
	public void doLogin (String username, String password) {
		System.out.println("Sucefully logged in with username");
	}
	
	
}
