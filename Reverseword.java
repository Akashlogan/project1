package Basiccode;

public class Reverseword {
	
	public static String reverswords(String str) {
		String[] words=str.split(" ");
		String result= "";
		
		for(int i= words.length-1;i>=0;i--) {
			if(i==0) {
				result=result+words[i]+" ";
			}else{
				result=result+words[i]+" ";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Xavient digital";
		System.out.println(reverswords(str));
	}

}
