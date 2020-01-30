import java.util.Scanner;

public class Uppgift_5 {

	public static void main(String[] args) {
		
		System.out.println(sumOfEvenlyDivided(getNumberOfType("top limit"), getNumberOfType("divider")));

	}

	public static int sumOfEvenlyDivided(int topLimit, int divider) {
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			if(i % divider == 0) {
				sum += i;
			}
		}
		
		return sum;
		
		//Alternativt sätt att beräkna på:
		/*
		for (int i = 1; i <= 1000; i+divider) {
		 
			sum += i;
		}
		*/
	}
	
	public static int getNumberOfType(String numberType) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a " + numberType + ": ");
		return input.nextInt();
	}
	
}
