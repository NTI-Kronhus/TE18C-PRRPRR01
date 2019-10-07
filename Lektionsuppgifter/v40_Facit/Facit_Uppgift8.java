import java.util.Scanner;

public class Facit_Uppgift8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv antalet timmar: ");
		int hours = input.nextInt();
		System.out.println("Skriv antalet minuter: ");
		int minutes = input.nextInt();
		System.out.println("Skriv antalet sekunder: ");
		int seconds = input.nextInt();

		int total = seconds + minutes*60 + hours*3600;
		
		System.out.println("Totala antalet sekunder: " + total);
	}

}
