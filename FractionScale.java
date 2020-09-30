//Name: Sydney Varner
//PantherID:002-527-007
//Due Date: July 7
//=======================================
import java.util.*;

public class FractionScale {	
	public static void main(String[] args) {
		System.out.println("This program performs the scaling operations on a fraction");
		Scanner console = new Scanner(System.in);
		System.out.print("\nEnter a fraction: ");
		String userFractionString = console.nextLine();
		int indexOfSlash = userFractionString.indexOf("/");
		
		//This line of code creates a substring of the user's input until the divide symbol
		String beforeSlash =  userFractionString.substring(0,indexOfSlash);
		int beforeStartIndex = 0;
		//This while loop gets rid of the spaces in the input string before the first number
		//While the first index char is equal to a space , the string is shortened from the beginning
		while(beforeSlash.charAt(0) == 32) {
			beforeSlash = beforeSlash.substring(beforeStartIndex + 1);
		}
		
		//this variable is equal to the last index of the string
		int beforeLastIndex = beforeSlash.length() - 1;
		//this while loop gets rid of the spaces after the first integer
		//while the last index is equal to a space, the string is shortened from the end
		while(beforeSlash.charAt(beforeLastIndex) == 32) {
			beforeSlash = beforeSlash.substring(0, beforeLastIndex);
			//The last index has to be decremented
			beforeLastIndex--;
		}
		
		//This line of code creates a substring of the user's input after the divide symbol
		String afterSlash =  userFractionString.substring(indexOfSlash + 1);
		int afterStartIndex = 0;
		//This while loop gets rid of the spaces in the input string before the second number
		//While the first index char is equal to a space , the string is shortened from the beginning
		while(afterSlash.charAt(0) == 32) {
			afterSlash = afterSlash.substring(afterStartIndex + 1);
		}
		
		//this variable is equal to the last index of the string
		int afterLastIndex = afterSlash.length() - 1;
		
		//this while loop gets rid of the spaces after the second integer
		//while the last index is equal to a space, the string is shortened from the end
		while(afterSlash.charAt(afterLastIndex) == 32) {
			afterSlash = afterSlash.substring(0, afterLastIndex);
			afterLastIndex--;
		}
		
		//These lines of code turn the string number into an integer
		int numerator = Integer.parseInt(beforeSlash);
		int denominator = Integer.parseInt(afterSlash);
		
		//This creates a new Fraction object
		Fraction userFraction = new Fraction(numerator, denominator);
		System.out.print("\nScale up or down (1: up, 0: down): ");
		int userResponse = console.nextInt();
		boolean userSign;
		//If the user entered a 1, the fraction will be scaled up
		if (userResponse == 1) {
			userSign = true;
		}
		//If the user entered a 0, the fraction will be scaled down
		else {
			userSign = false;
		}
		System.out.print("\nEnter a scale factor: ");
		int scaleFactor = console.nextInt();
		
		//Performs the scaling by calling the Fraction method scale
		userFraction.scale(scaleFactor, userSign);
		
		//Prints out the fraction
		System.out.print(userFraction.toString());
	}
}
