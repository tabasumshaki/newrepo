package actionItem03;

public class Fahrenheit {
//Write a method that accepts Celsius temperature as argument.
//	The method should return Fahrenheit temperature after converting
//			Celsius into Fahrenheit.
//
//			[Formula F=(C x 9/5) + 32]
	
	public static void main(String[] args) {
		
		System.out.println(convert(34));

	}

	public static double convert(double celcius) {
	
	double fahrenheit =  (celcius * 9/5) + 32; 
	return fahrenheit;
	
	}
	
}
