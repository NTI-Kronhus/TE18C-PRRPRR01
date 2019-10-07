import java.util.Scanner;

public class Facit_Uppgift6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in radien: ");
		double radius = input.nextDouble();
		System.out.println("Skriv in höjden: ");
		double height = input.nextDouble();
		
		double volume = radius * radius * Math.PI * height;
		// Också godtagbart:
		// double volume = radius * radius * 3.14 * height;
		
		System.out.println("Volymen är: " + volume);

	}

}
