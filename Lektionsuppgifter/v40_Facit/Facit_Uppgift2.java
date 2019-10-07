import java.util.Scanner;

public class Facit_Uppgift2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		//Tar in ett heltal och skapar en variabel sum som i slutändan ska bli svaret.
		int num = input.nextInt();
		int sum = 0;
		
		//Loopar tills num blir 0.
		while(num != 0) {
			sum += num % 10; //Lägger till entalet från num till sum.
			num /= 10; //Tar bort entalet så att det nya entalet är det som tidigare var tiotalet.
		}
		
		System.out.println(sum);

	}

}
