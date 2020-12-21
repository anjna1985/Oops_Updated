package constructor;

public class Demo3 {
	int  value1;
    int  value2;
	    Demo3(){
	      value1 = 1;
	      value2 = 2;
	      System.out.println("Inside 1st Parent Constructor");
	   }
	   Demo3(int a){
	      value1 = a;
	      System.out.println("Inside 2nd Parent Constructor");
	   }
	  public void display(){
	     System.out.println("Value1 === "+value1);
	     System.out.println("Value2 === "+value2);
	  }
	public static void main(String[] args) {
		Demo3Child d1 = new Demo3Child();
	     d1.display();
	}
}
