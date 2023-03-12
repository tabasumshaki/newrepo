package polymorphism;

public class Websterbank extends Central_bank{

	public static void main(String[] args) {
		// making obj on same class.
		Websterbank obj = new Websterbank();
		// print the int rate
		System.out.println("The Webster interest rate is "+ obj.homeloanint());
		
		
	}
	// this is an overridden method
	// if webster want to give the rate from central bank then just comment out the code of this class.
	// it will auto take its parent class method( which is same name) and show cdentrals rate as webstars.
	
//	public double homeloanint() {
//		
//		double intrate= 5.5;
//		return intrate;
//	}
	
	
	
	
	
	
}
