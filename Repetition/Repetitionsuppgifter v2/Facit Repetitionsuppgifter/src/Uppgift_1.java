import java.util.Scanner;

public class Uppgift_1 {
	
	public static void main(String[] args) {
		
		System.out.println("Exempeluppgift 1: " + biggestNumber(getNumber(), getNumber()));
		
	}

	public static int getNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		return input.nextInt();
	}
	
	public static int biggestNumber(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
}
