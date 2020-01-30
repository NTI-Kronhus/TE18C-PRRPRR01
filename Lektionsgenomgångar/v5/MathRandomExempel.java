import java.util.Random;

public class MathRandomExempel {

	public static void main(String[] args) {

		//rullar en t�rning 10 g�nger
		for (int i = 0; i < 10; i++) {
			System.out.println(randomNumber(1, 6));
		}

	}
	
	
	
	/**
	 * En metod som genererar ett slumpat heltal fr�n och med ett visst tal till och med ett annat. 
	 * 
	 * @param bottom det l�gsta v�rdet som kan genereras
	 * @param top det h�gsta v�rdet som kan genereras
	 * @return det slumpade heltalet
	 */
	public static int randomNumber(int bottom, int top) {
		Random random = new Random();
		
		//random.nextInt(top) returnerar ett heltal fr.o.m 0 upp till toppv�rdet (exempelvis 0-5 om toppv�rdet �r 6)
		//d�rf�r anropar vi nextInt med indata (top-bottom+1) ist�llet, och l�gger sedan till bottenv�rdet efter�t
		//(exempelvis top=6 bottom=1 ger oss f�rst v�rdet 0 till 5 (6-1+1 = 6), och sedan l�gger vi till 1 och f�r spannet 1 till 6
		return random.nextInt(top - bottom + 1) + bottom;
	}
	
	
	
	/*  
	 * Ett annat s�tt att skriva metoden p�:
	 * skillnaden h�r �r att Math.random() returnerar ett decimaltal mellan 0.0 - 1.0
	 * vilket g�r att det blir ungef�r samma ber�kning, men den ser lite annorlunda ut
	 
	 public static int randomNumber(int bottom, int top) {
		double rand = Math.random();
		
		rand *= (top - bottom + 1);
		rand += bottom;
		
		return (int)rand;
	}
	 
	 */

}
