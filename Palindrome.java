package Basiccode;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



			int n = 48984;
			int s=0;
			int r;
			int t=n;
			while (n>0) {
				r=n%10;
				n=n/10;
				s=s*10+r;
			}
			if(t==s) {
				System.out.println("palindrome");
			}else {
				System.out.println("not palindrome");
			}
			
	}

}
