import java.util.Scanner;

public class Facit_Uppgift5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
				
		int sum = 0;
		
		for (int i = 0; i < 10000; i++) { //Loopar fr�n 0 till 10000
			if(i % 7 == 0) { //Om i �r j�mnt delbart med 7:
				sum += i;
			}
		}
		
		//Alternativ l�sning:
		/*for (int i = 0; i < 10000; i+=7) {
			sum += i;
		}*/

		System.out.println("Summa: " + sum);
	}

}
