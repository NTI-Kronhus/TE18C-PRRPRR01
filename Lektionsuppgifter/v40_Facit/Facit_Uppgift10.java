import java.util.Scanner;

public class Facit_Uppgift10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in storleken p� basen av pyramiden: ");
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size-i; j++) {
				System.out.print(" "); //Skriver ut alla mellanrum innan sj�lva pyramiden
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("x "); //Skriver ut sj�lva pyramiden
			}
			
			System.out.println();
		}

	}

}
