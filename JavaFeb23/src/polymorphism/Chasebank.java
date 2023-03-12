package polymorphism;

public class Chasebank extends Central_bank{

	public static void main(String[] args) {
		
		// webdriver driver = new chromedriver(); this is polymorphic ref. 
		// here only methods that are in parent class will be available.
		// chromedriver driver = new webdriver(); wrong
		Chasebank obj = new Chasebank();
		
		System.out.println("The Webster interest rate is "+ obj.homeloanint());
		
	}
	
	public double homeloanint() {
		// double intrate = 4.5;
		// return intrate;
		
		return 4.5;
	}
	
	
	
	
	
	
	
}
