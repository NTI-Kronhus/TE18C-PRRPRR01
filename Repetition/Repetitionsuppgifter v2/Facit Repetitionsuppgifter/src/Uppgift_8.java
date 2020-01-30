import java.util.Scanner;

public class Uppgift_8 {

	public static void main(String[] args) {


		printProductTable(getNumberOfType("size"));

	}

	public static void printProductTable(int size) {
		for (int i = 1; i <= size; i++) { 
			
			for (int j = 1; j <= size; j++) { 
				
				int product = i * j;

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
	
	public static int getNumberOfType(String numberType) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a " + numberType + ": ");
		return input.nextInt();
	}
	
}
