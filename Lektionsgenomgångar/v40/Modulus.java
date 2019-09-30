
public class Modulus {

	public static void main(String[] args) {

		//Modulus r�knas ut resten vid division. Exempel:
		int a = 5 % 2; // a == 1
		int b = 25 % 4; // b == 1
		int c = 85 % 15; // c == 10
		
		//Finns massa olika anv�ndningsomr�den, fantasin s�tter gr�nserna. 
		//Tv� exempel:

		//Kan anv�ndas f�r att r�kna ut om ett tal �r j�mnt eller ej:
		if(5%2 != 0) {
			System.out.println("Odd");
		} else {
			System.out.println("Even");
		}
		
		//Kan �ven anv�ndas om man har x antal h�ndelser som ska ske upprepade g�nger, 
		//som t.ex. n�r man har olika spelar i n�got spel (yahtzee, s�nka skepp, etc):
		int turn = 0;
		while(true) {
			if(turn % 3 == 0) {
				System.out.println("Fabians tur");
			} else if (turn % 3 == 1) {
				System.out.println("Jeffreys tur");
			} else if (turn % 3 == 2) {
				System.out.println("Leos tur");
			}
			
			//K�r en spelares omg�ng
			
			turn++;
			
			if(turn == 9) {
				break;  //G�r ut ur loopen om man spelat 9 rundor
			}
		}
	}

}
