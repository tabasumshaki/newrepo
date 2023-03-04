package dataTypes;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		
		
		/** Assignment operators are ( =, +=, -=, *=, /= and %=)
		 * a = 7 meaning a= 7
		 * a+= 7 meaning a+= a+ 7
		 * a-= 7 meaning a- = a- 7
		 * a*= 7 meaning a* = a*7
		 * a/= 7 meaning a/= a/7
		 * a%= 7 meaning a%= a%7
		 * Examples:
		 *
		 * 
		 */
        int a = 87;
       // int result = a-7;
        //int result1 = a/7;
        
        System.out.println(a+=7); // 94, means with the value of 'a' add 7 more 
   
        //    System.out.println(); //80, from 'a' substact 7, dint worked
        System.out.println(a*=7); // 658
        //System.out.println(); // ?
        //System.out.println(a%=7);//?
	}

}
