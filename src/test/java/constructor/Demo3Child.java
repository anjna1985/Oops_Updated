package constructor;

public class Demo3Child extends Demo3{
	    int value3;
	    int value4;
	    Demo3Child(){
	    //super(5);
	     value3 = 3;
	     value4 = 4;
	    System.out.println("Inside the Constructor of Child");
	    }
	    public void display(){
	      System.out.println("Value1 === "+value1);
	      System.out.println("Value2 === "+value2);
	      System.out.println("Value1 === "+value3);
	      System.out.println("Value2 === "+value4);
	   }
	
}
