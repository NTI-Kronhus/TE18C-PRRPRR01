import java.util.Scanner;

public class Facit_Uppgift3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int sum = 0; //Den totala summan.
		int numbers = 0; //Antalet nummer som l�ses in.
		
		boolean running = true;
		while(running) {
			int tempNum = input.nextInt();
			
			if(tempNum == 0) {
				running = false; //G�r s� att loopen inte k�r n�sta iteration.
			} 
			else {
				sum += tempNum; 
				numbers++;
			}
		}
		
		double avg = (double) sum / numbers; //R�knar ut medelv�rdet.
		
		System.out.println("Summa: " + sum);
		System.out.println("Medelv�rde: " + avg);
		
	}

}
