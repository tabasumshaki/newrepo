package dataTypes;

public class JavaOperators {
	
	
	/** there are 5 types of java operators
	 * arithmetic operator
	 * assignment operator
	 * comarison/ relational operator
	 * logical operator
	 * bitwise operator
	 * 
	 */
	
	public static void main(String[] args) {
		
		// learning arithmetic operators
		// they are + - * / % ++ --
		
		
		int a = 10;
		int b = 5;
		int result;
		
		result = a+b; // addition
		System.out.println("Addition result is " + result);// 15
		result = a-b; // addition
		System.out.println("substraction result is " + result);// 5
		result = a*b; // addition	
		System.out.println("Multiplication result is " + result);//50
		result = a/b; // addition
		System.out.println("division result is " + result);//2
		result = a%b; // addition
		System.out.println("modulus result is " + result);//0
		System.out.println("incremental a is " + a++);//? this will not work this way
		System.out.println("decremental a is " + a--);// this will not work
	}
	
}
