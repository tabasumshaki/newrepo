package dataTypes;

public class ComparisonOperator {

	public static void main(String[] args) {
		
		String actual = "Google";
		String expected = "google";
		
		System.out.println(actual!=expected); 
		/* == means equal
		 * != means not equal
		 * >
		 * <
		 * >=
		 * <=
		 * 
		 */
		
		int a = 15;
		int b = 16;
		
		System.out.println(a>b);// false
		System.out.println(a<b);// true
	}

}
