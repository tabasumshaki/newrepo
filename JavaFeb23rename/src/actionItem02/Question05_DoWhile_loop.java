package actionItem02;

public class Question05_DoWhile_loop {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		System.out.println("start");
		int [] s= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int sum= 0;
		
		
		int i = 0;
		do {sum += i ;
		i++;}
		
		while (i<s.length);
		System.out.println(sum );
		
		// if i want to show cronological addition
		
		System.out.println("start again");
		int ij = 0;
		do {ij++;}
		
		while (ij<s.length);
		System.out.println(sum += ij );
		
		
		
		
		
		
		
		
	}

}
