package polymorphism;

public class Calculator {

// example of method overloading ( this is compile time polymorphism)
	public void doadd() {
		
		System.out.println("First add method");
		
	}
    public void doadd(int a) {
		
		System.out.println("Second add method");
		
	}
    public void doadd(int a, int b) {
		
	    
		System.out.println("Addition of  numbers: " + (a+b));
		
	}
public void doadd(int a, int b, int c) {
		
	    
		System.out.println("Addition of 3 numbers: " + (a+b+c));
		
	}
public void doadd(int a, double b, int c) {
	
    
	System.out.println("Addition of 3 numbers: " + (a+b+c));
	
}
	
	
	
	
	
	
	
	
	
}
