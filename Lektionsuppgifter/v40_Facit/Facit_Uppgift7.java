import java.util.Scanner;

public class Facit_Uppgift7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in storleken på kvadraten: ");
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) { //Loop för varje rad
			
			for (int j = 0; j < size; j++) { //Loop för varje "bokstav"
				if(i == 0 || i == size-1 || j == 0 || j == size-1) { 
					System.out.print('$'); 
				}
				else {
					System.out.print(' ');
				}
			}
			
			System.out.println();
		}

	}

}
