package dataTypes;

public class ElseIf_demo {

	public static void main(String[] args) {
		
		/* else if syntax:
		 * if (condition)
		 * { code to be executed
		 * }
		 *  else if (condition)
		 *{ code to be executed
		 *}
		 *else 
		 *{code to be executed
		 *}
		 */
		
		int age = 99;
		if (age >= 18 && age <= 80)
		{ System.out.println("It is high time to get married");}
		else if (age > 80 && age <= 129)
		{ System.out.println("Pray to god that you are in good health");}
		else 
		{System.out.println("You are too young !! \nwait for a while");}// \n is a line breaker.

	}

}
