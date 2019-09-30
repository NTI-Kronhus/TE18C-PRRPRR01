
public class Modulus {

	public static void main(String[] args) {

		//Modulus räknas ut resten vid division. Exempel:
		int a = 5 % 2; // a == 1
		int b = 25 % 4; // b == 1
		int c = 85 % 15; // c == 10
		
		//Finns massa olika användningsområden, fantasin sätter gränserna. 
		//Två exempel:

		//Kan användas för att räkna ut om ett tal är jämnt eller ej:
		if(5%2 != 0) {
			System.out.println("Odd");
		} else {
			System.out.println("Even");
		}
		
		//Kan även användas om man har x antal händelser som ska ske upprepade gånger, 
		//som t.ex. när man har olika spelar i något spel (yahtzee, sänka skepp, etc):
		int turn = 0;
		while(true) {
			if(turn % 3 == 0) {
				System.out.println("Fabians tur");
			} else if (turn % 3 == 1) {
				System.out.println("Jeffreys tur");
			} else if (turn % 3 == 2) {
				System.out.println("Leos tur");
			}
			
			//Kör en spelares omgång
			
			turn++;
			
			if(turn == 9) {
				break;  //Går ut ur loopen om man spelat 9 rundor
			}
		}
	}

}
