package Basiccode;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12345,reverse=0;
		while(number!=0) {
			int reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
			
		}
		System.out.println("The reverse number is " +reverse);
	}

}
