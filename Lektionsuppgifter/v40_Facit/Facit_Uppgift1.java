import java.util.Scanner;

public class Facit_Uppgift1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//L�ser in tv� heltal
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		//Kollar vilken som �r minst och skriver ut den
		if(num1 < num2) {
			System.out.println(num1);
		} 
		else {
			System.out.println(num2);
		}
	
	}

}
