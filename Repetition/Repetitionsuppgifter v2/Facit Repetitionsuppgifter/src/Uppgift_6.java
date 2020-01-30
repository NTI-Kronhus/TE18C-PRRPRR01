import java.util.Scanner;

public class Uppgift_6 {

	public static void main(String[] args) {

		printSquare(getNumberOfType("size"));
		
	}
	
	public static void printSquare(int size) {
		for (int i = 0; i < size; i++) { 
			
			for (int j = 0; j < size; j++) { 
				
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

	public static int getNumberOfType(String numberType) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a " + numberType + ": ");
		return input.nextInt();
	}
	
}
