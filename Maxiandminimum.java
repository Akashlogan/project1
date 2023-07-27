package Basiccode;

public class Maxiandminimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {52,98,20,100,5};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("maximum element is" + max);
		
	}

	}


