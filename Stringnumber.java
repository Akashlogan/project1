package Basiccode;

public class Stringnumber {

	
	 public static void main(String[] args) {
        String number1 = "12345Test";
        String number2 = "12345";

        System.out.println("Input: " + number1);
        if (isNumber(number1)) {
            System.out.println("Given String is a number");
        } else {
            System.out.println("Given String is not a number");
        }

        System.out.println("Input: " + number2);
        if (isNumber(number2)) {
            System.out.println("Given String is a number");
        } else {
            System.out.println("Given String is not a number");
        }
    }

    public static boolean isNumber(String input) {
        return input.matches("-?\\d+(\\.\\d+)?"); // Matches integers or decimals (positive or negative)
    }
}
