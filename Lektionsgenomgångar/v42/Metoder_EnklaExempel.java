
public class Metoder_EnklaExempel {

	//Main-metoden ska alltid finnas med, 
	//det är den som körs när ni startar programmet.
	public static void main(String[] args) {
		
		//Ni kör metoderna genom att skriva deras namn,
		//+ eventuell indata i parentesen.
		//Detta kallas för att "anropa" metoden.
		methodOne(5);
		methodOne(3);
		
		//Man kan ha flera indata, som separeras med kommatecken
		methodTwo(5, 3);
		
		//När en metod "returnar" ett värde kan man 
		//spara det i en variabel
		String hello = methodThree("Are");
		System.out.println(hello);
		
		//Men man måste inte spara det, man kan skriva ut direkt
		//(eller göra andra saker med värdet)
		System.out.println(methodThree("Fabian"));
		
	}
	
	//--------------------------------------------------------
	//Övriga, egenskrivna metoder skrivs utanför main-metoden, 
	//alltså här:
	
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
		return ("Hej " + str + ", du är fett cool :)");
	}

}
