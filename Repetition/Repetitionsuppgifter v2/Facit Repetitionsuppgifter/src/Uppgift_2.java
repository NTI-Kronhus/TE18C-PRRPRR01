import java.util.Scanner;

public class Uppgift_2 {
	
	public static void main(String[] args) {
		
		System.out.println("Exempeluppgift 2: " + calculateDigitSum(getNumber()));
		
	}

	public static int getNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		return input.nextInt();
	}
	
	public static int calculateDigitSum(int num) {
		int digitSum = 0;
		
		while(num > 0) {
			digitSum += num % 10;
			num /= 10;
		}
		
		return digitSum;
	}
	
}
