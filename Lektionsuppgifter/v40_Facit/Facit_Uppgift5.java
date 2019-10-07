import java.util.Scanner;

public class Facit_Uppgift5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
				
		int sum = 0;
		
		for (int i = 0; i < 10000; i++) { //Loopar från 0 till 10000
			if(i % 7 == 0) { //Om i är jämnt delbart med 7:
				sum += i;
			}
		}
		
		//Alternativ lösning:
		/*for (int i = 0; i < 10000; i+=7) {
			sum += i;
		}*/

		System.out.println("Summa: " + sum);
	}

}
