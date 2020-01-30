import java.util.Scanner;

public class Uppgift_4 {

	public static void main(String[] args) {
		
		System.out.println(numberSequence(10, 100000));

	}

	public static int numberSequence(int numberLimit, int productLimit) {
		int product = 1;
		
		for (int i = 1; i <= numberLimit; i++) {
			int tempNum = getNumber();
			product *= tempNum;
			
			if(product >= productLimit) {
				break;
			}
		}
		
		return product;
	}
	
	public static int getNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		return input.nextInt();
	}
}
