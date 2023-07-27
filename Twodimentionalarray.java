package Basiccode;

public class Twodimentionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     int[][] twoDArray = {
	             {12, 22, 33},
	             {42, 35, 46},
	             {73, 48, 49}
	         };

	         // Retrieve values from the two-dimensional array
	         int numRows = twoDArray.length;
	         int numColm = twoDArray[0].length;

	         for (int i = 0; i < numRows; i++) {
	             for (int j = 0; j < numColm; j++) {
	                 int value = twoDArray[i][j];
	                 System.out.print(value + " ");
	             }
	             System.out.println();
	         }
	     }
	 

}
