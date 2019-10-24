
public class Facit_v43_metoder {

	public static void main(String[] args) {

		System.out.println("Uppgift 1: ");
		lol();
		
		System.out.println();

		System.out.println("Uppgift 2: ");
		System.out.println(min(5, 3));
		
		System.out.println();
		
		System.out.println("Uppgift 3: ");
		count(13);
		
		System.out.println();
		
		System.out.println("Uppgift 4: ");
		System.out.println(kelvin(10.5));
		
		System.out.println();
		
		System.out.println("Uppgift 5: ");
		ageControl(22);
		
		System.out.println();
		
		System.out.println("Uppgift 6: ");
		stair(4);
		
		System.out.println();
		
	}
	
	/**
	 * Uppgift 1
	 */
	public static void lol() {
		System.out.println("HAHAHAHAHAHAHA");
	}
	
	
	
	/**
	 * Uppgift 2
	 */
	public static int min(int a, int b) {
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	
	
	/**
	 * Uppgift 3
	 */
	public static void count(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
	
	/**
	 * Uppgift 4
	 */
	public static double kelvin(double celsius) {
		return celsius + 273.15;
	}
	
	
	
	/**
	 * Uppgift 5
	 */
	public static void ageControl(int age) {
		if(age <= 5) {
			System.out.println("Småbarn får inte göra något.");
		}
		else if(age <= 12) {
			System.out.println("Du får spela Fortnite.");
		}
		else if(age <= 14) {
			System.out.println("Du är tonåring.");
		}
		else if(age <= 17) {
			System.out.println("Du får köra moppe.");
		}
		else if(age <= 20) {
			System.out.println("Du får köra bil.");
		}
		else if(age <= 64) {
			System.out.println("Du får vuxenstraff om du gör något dumt.");
		}
		else if(age <= 99) {
			System.out.println("Du är pensionär.");
		}
		else {
			System.out.println("R.I.P?");
		}
	}
	
	
	
	/**
	 * Uppgift 6
	 */
	public static void stair(int steps) {
		//Yttre loop för varje rad
		for(int i = 1; i <= steps; i++) {
			//Inre loop för varje char
			for(int j = 1; j <= steps; j++) {
				if(j > (steps - i)) {
					System.out.print('X');
				}
				else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}

}
