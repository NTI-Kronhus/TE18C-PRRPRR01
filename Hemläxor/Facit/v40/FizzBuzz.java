import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int fizz = input.nextInt();
		int buzz = input.nextInt();
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i % fizz == 0 && i % buzz == 0) {
				System.out.println("FizzBuzz");
			} 
			else if(i % fizz == 0) {
				System.out.println("Fizz");
			} 
			else if(i % buzz == 0) {
				System.out.println("Buzz");
			} 
			else {
				System.out.println(i);
			}
		}

	}

}
