import java.util.Scanner;

public class Uppgift_3 {

	public static void main(String[] args) {
		
		System.out.println("Exempeluppgift 3: " + reverse(getString()));

	}

	public static String reverse(String stringToReverse) {
		String reversedString = "";
		
		for (int i = stringToReverse.length()-1; i >= 0; i--) {
			reversedString += stringToReverse.charAt(i);
		}
		
		return reversedString;
	}
	
	public static String getString() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		return in.nextLine();
	}
	
}
