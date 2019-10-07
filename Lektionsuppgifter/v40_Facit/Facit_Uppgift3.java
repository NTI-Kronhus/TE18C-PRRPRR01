import java.util.Scanner;

public class Facit_Uppgift3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int sum = 0; //Den totala summan.
		int numbers = 0; //Antalet nummer som läses in.
		
		boolean running = true;
		while(running) {
			int tempNum = input.nextInt();
			
			if(tempNum == 0) {
				running = false; //Gör så att loopen inte kör nästa iteration.
			} 
			else {
				sum += tempNum; 
				numbers++;
			}
		}
		
		double avg = (double) sum / numbers; //Räknar ut medelvärdet.
		
		System.out.println("Summa: " + sum);
		System.out.println("Medelvärde: " + avg);
		
	}

}
