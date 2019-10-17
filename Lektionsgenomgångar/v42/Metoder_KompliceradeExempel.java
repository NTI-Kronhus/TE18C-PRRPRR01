import java.util.Scanner;

public class Metoder_KompliceradeExempel {

	public static void main(String[] args) {

		test();
		
		System.out.println("----------------------");
		System.out.println(max(2, 2, 2));
		
		System.out.println("----------------------");
		System.out.println(max(2, 5, 3));
		
		System.out.println("----------------------");
		System.out.println(getName());
		
		System.out.println("----------------------");
		System.out.println(askQuestion("Var bor du?"));
		
		System.out.println("----------------------");
		System.out.println(isEven(9));
		
		System.out.println("----------------------");
		System.out.println(isEven(12));

	}

	//Skickar tillbaks det största av tre tal
	public static int max(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else if (c >= a && c >= b) {
			return c;
		} else {
			return a; // spelar ingen roll
		}

	}

	//Frågar efter, och skickar tillbaks ett namn
	public static String getName() {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv ditt namn: ");
		String name = input.nextLine();
		return name;
	}

	
	//Ställer valfri fråga och skickar tillbaks svaret
	public static String askQuestion(String q) {
		Scanner input = new Scanner(System.in);
		System.out.print(q);
		String ans = input.nextLine();
		return ans;
	}

	
	//Skickar tillbaks om ett tal är jämnt eller inte
	public static boolean isEven(int tal) {
		if (tal % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	//Skriver ut alla tal från 0 till 5
	public static void test() {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

	}

}