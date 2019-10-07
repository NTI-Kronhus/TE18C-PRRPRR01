import java.util.Scanner;

public class Facit_Uppgift9 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) { //Loop för varje rad
			
			for (int j = 1; j <= 10; j++) { //Loop för varje tal
				
				int product = i * j;

				// Vill man att det ser snyggt ut måste man skriva ut
				// två mellanslag om produkten är ett ental, ej obligatoriskt.
				if(product < 10) { 
					System.out.print(product + "  ");
				}
				else {
					System.out.print(product + " ");
				}
				
			}
			
			System.out.println();
			
		}

	}

}
