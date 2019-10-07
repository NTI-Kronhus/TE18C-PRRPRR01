import java.util.Scanner;

public class Facit_Uppgift4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int sum = 1;
		int amountOfNumbers = 0;
		
		while(amountOfNumbers < 10 && sum <= 100000) {
			int tempNum = input.nextInt();
			sum *= tempNum;
			amountOfNumbers++;
		}
		
		System.out.println("Summa: " + sum);
		System.out.println("Antal tal inlästa: " + amountOfNumbers);

	}

}
