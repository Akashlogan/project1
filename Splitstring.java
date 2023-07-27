package Basiccode;

public class Splitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Test@#$For1234Here987&";

        String numbers = "";
        String alphabets = "";
        String specialSymbols = "";

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers += ch;
            } else if (Character.isLetter(ch)) {
                alphabets += ch;
            } else {
                specialSymbols += ch;
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Numbers: " + numbers);
        System.out.println("Alphabets: " + alphabets);
        System.out.println("Special Symbols: " + specialSymbols);
    }

}
