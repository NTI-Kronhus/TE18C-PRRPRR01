import java.util.Scanner;

public class Uppgift_9 {

	public static void main(String[] args) {
		
		printPyramid(getNumberOfType("size"));
		
	}

	public static void printPyramid(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size-i; j++) {
				System.out.print(" "); 
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("x "); 
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
