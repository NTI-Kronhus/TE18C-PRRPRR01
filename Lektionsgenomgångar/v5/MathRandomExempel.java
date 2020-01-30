import java.util.Random;

public class MathRandomExempel {

	public static void main(String[] args) {

		//rullar en tärning 10 gånger
		for (int i = 0; i < 10; i++) {
			System.out.println(randomNumber(1, 6));
		}

	}
	
	
	
	/**
	 * En metod som genererar ett slumpat heltal från och med ett visst tal till och med ett annat. 
	 * 
	 * @param bottom det lägsta värdet som kan genereras
	 * @param top det högsta värdet som kan genereras
	 * @return det slumpade heltalet
	 */
	public static int randomNumber(int bottom, int top) {
		Random random = new Random();
		
		//random.nextInt(top) returnerar ett heltal fr.o.m 0 upp till toppvärdet (exempelvis 0-5 om toppvärdet är 6)
		//därför anropar vi nextInt med indata (top-bottom+1) istället, och lägger sedan till bottenvärdet efteråt
		//(exempelvis top=6 bottom=1 ger oss först värdet 0 till 5 (6-1+1 = 6), och sedan lägger vi till 1 och får spannet 1 till 6
		return random.nextInt(top - bottom + 1) + bottom;
	}
	
	
	
	/*  
	 * Ett annat sätt att skriva metoden på:
	 * skillnaden här är att Math.random() returnerar ett decimaltal mellan 0.0 - 1.0
	 * vilket gör att det blir ungefär samma beräkning, men den ser lite annorlunda ut
	 
	 public static int randomNumber(int bottom, int top) {
		double rand = Math.random();
		
		rand *= (top - bottom + 1);
		rand += bottom;
		
		return (int)rand;
	}
	 
	 */

}
