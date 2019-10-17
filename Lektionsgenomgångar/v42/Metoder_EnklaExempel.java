
public class Metoder_EnklaExempel {

	//Main-metoden ska alltid finnas med, 
	//det �r den som k�rs n�r ni startar programmet.
	public static void main(String[] args) {
		
		//Ni k�r metoderna genom att skriva deras namn,
		//+ eventuell indata i parentesen.
		//Detta kallas f�r att "anropa" metoden.
		methodOne(5);
		methodOne(3);
		
		//Man kan ha flera indata, som separeras med kommatecken
		methodTwo(5, 3);
		
		//N�r en metod "returnar" ett v�rde kan man 
		//spara det i en variabel
		String hello = methodThree("Are");
		System.out.println(hello);
		
		//Men man m�ste inte spara det, man kan skriva ut direkt
		//(eller g�ra andra saker med v�rdet)
		System.out.println(methodThree("Fabian"));
		
	}
	
	//--------------------------------------------------------
	//�vriga, egenskrivna metoder skrivs utanf�r main-metoden, 
	//allts� h�r:
	
	public static void methodOne(int x) {
		System.out.println(x);
	}
	
	public static void methodTwo(int x, int y) {
		if(x >= y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
	}
	
	public static String methodThree(String str) {
		return ("Hej " + str + ", du �r fett cool :)");
	}

}
