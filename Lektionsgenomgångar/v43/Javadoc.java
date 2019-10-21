import java.util.Scanner;

public class Javadoc {

	public static void main(String[] args) {
		
		/*
		 * När ni gör era uppgifter från och med nu vill jag
		 * att ni skriver kommentarer och Javadoc på ALLT
		 * 
		 */
		
		//Ni kan skriva kommentarer 
		//så här
		
		/*
		 * eller så här
		 */

	}

	/*
	 * Javadoc skriver ni på varje METOD 
	 * som nedanstående kod:
	 */
	
	
	
	//SYNTAX:
	/**
	 * 
	 * Här beskriver du vad metoden gör
	 * 
	 * @param variabelnamn - här skriver du syftet med variabeln x 
	 * @return här skriver du vad metoden returnar (OM den returnar något)
	 */
	public static int metod(int variabelnamn) {
		return 0;
	}
	
	
	
	//EXEMPEL 1:
		/**
		 * 
		 * Metoden skriver ut alla siffror från ett till tio.
		 */
		public static void countToTen() {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		}
	
		
		
	//EXEMPEL 2:
	/**
	 * 
	 * Metoden skriver ut alla siffror från ett till en viss gräns.
	 * 
	 * @param limit Gränsen som den skriver ut till.
	 * @return Skickar tillbaks det magiska numret.
	 */
	public static int countToLimit(int limit) {
		for (int i = 1; i <= limit; i++) {
			System.out.println(i);
		}
		return 3;
	}

}
