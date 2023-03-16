package encapsulation;

public class atmbooth {

	public static void main(String[] args) {
		
		bank obj = new bank();
		//obj.pinNumber = 12349;
	//	obj.drawMoney(12345678, 12349, 1000);

		// it letting you update here in pin number which is not in this class even.
		// and by that we can draw money. so we need to do something on bank class. we did private 
		
		
		obj.updatePin(12345678, 1234, 12349);
		obj.drawMoney(12345678, 12349, 1000);
		
		// unchecked exceptions 
		int [] number = {5,9,2,78};
		//System.out.println(number[4]);
		// compiler cant check that [4] is not available. tahts why its not showing sign on the left side of line.
		// but when we run it, it says exception
		
		int a=5, result;
		result = 5/0;
		System.out.println(result);
		
		
		
	}

}
