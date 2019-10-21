import java.util.Scanner;

public class Javadoc {

	public static void main(String[] args) {
		
		/*
		 * N�r ni g�r era uppgifter fr�n och med nu vill jag
		 * att ni skriver kommentarer och Javadoc p� ALLT
		 * 
		 */
		
		//Ni kan skriva kommentarer 
		//s� h�r
		
		/*
		 * eller s� h�r
		 */

	}

	/*
	 * Javadoc skriver ni p� varje METOD 
	 * som nedanst�ende kod:
	 */
	
	
	
	//SYNTAX:
	/**
	 * 
	 * H�r beskriver du vad metoden g�r
	 * 
	 * @param variabelnamn - h�r skriver du syftet med variabeln x 
	 * @return h�r skriver du vad metoden returnar (OM den returnar n�got)
	 */
	public static int metod(int variabelnamn) {
		return 0;
	}
	
	
	
	//EXEMPEL 1:
		/**
		 * 
		 * Metoden skriver ut alla siffror fr�n ett till tio.
		 */
		public static void countToTen() {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		}
	
		
		
	//EXEMPEL 2:
	/**
	 * 
	 * Metoden skriver ut alla siffror fr�n ett till en viss gr�ns.
	 * 
	 * @param limit Gr�nsen som den skriver ut till.
	 * @return Skickar tillbaks det magiska numret.
	 */
	public static int countToLimit(int limit) {
		for (int i = 1; i <= limit; i++) {
			System.out.println(i);
		}
		return 3;
	}

}
