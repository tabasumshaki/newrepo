package methodDemo;

public class testCalculator {

	public static void main(String[] args) {
		
		
        // created an object of calculator class// type the name of class then variable 
		// then type = new than again  the name of class then ();
		
		calculator calc= new calculator();
		
		System.out.println("Addition of a and b is : " + calc.doAdd(25, 12));
		
		System.out.println("Value of a - b is : " + calc.dosub(4, 2));
		
		System.out.println( calc.concatstr("Hello", "I am learing Java!! It's fun!!"));
		
		testCalculator obj = new testCalculator();
		
		  System.out.println( obj.domul(2, 3));
		  obj.sound();
		  obj.dogsound();
		System.out.println( dodiv(5,7));
		 
		System.out.println( calculator.do3mul(4, 7, 78));
		
		System.out.println( dodiv(4, 5));
		
		  
	}
	
		public int domul(int a, int b) {
			int c = a*b;
			System.out.println("I am doing action in domul");
			
			return c;
		}
		
         
		public static double dodiv(int a, int b) {
			
			double c = a/b;
			return c;
			
		}
		
		public void sound() {
			
			System.out.println("This is a generic sound");
		}
		
		public void dogsound() {
			
			sound();
			System.out.println("i can also make dog sound");
		}
		
		
		
		

	}


