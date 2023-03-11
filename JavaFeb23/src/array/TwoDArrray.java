package array;

public class TwoDArrray {

	public static void main(String[] args) {


		// people say 2d array is row and column.
		// but its actually array inside an array
		int [][] my2dArray = new int [2][3];
		
		my2dArray [0][0] = 5;
		my2dArray [0][1] = 6;
		my2dArray [0][2] = 7;

		my2dArray [1][0] = 8;
		my2dArray [1][1] = 8;
		my2dArray [1][2] = 3;
		
		// nested loop means loop inside a loop
		
		//System.out.println(my2dArray [1][1]);
		
		System.out.println("length of my2dArray is : ");
		int lengthFirstArray = my2dArray.length;
		int lengthSecondArray = my2dArray[0].length;
		
		
		System.out.println(lengthFirstArray);
		
		System.out.println(lengthSecondArray);
		
		for (int i= 0; i<my2dArray.length; i++)
		{
			for (int j=0; j< my2dArray[0].length; j++) {
		
		
		System.out.println(my2dArray[i][j]);}
		}

	}

}
