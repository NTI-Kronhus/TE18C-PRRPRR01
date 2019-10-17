import java.util.Scanner;

public class Metoder_String {

	public static void main(String[] args) {

		// Här nedan finns exempel på ett flertal
		// inbyggda metoder i klassen String
		
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		// För att jämföra strängar, använd '.equals()', inte '=='.
		if (str.equals("Hej")) {
			System.out.println("HEJ");
		} else {
			System.out.println(str);
		}

		// Loopa igenom alla tecken i en String och gör något med varje tecken
		int length = str.length();
		for (int i = 0; i < length; i++) {
			System.out.println("INDEX " + i + ": " + str.charAt(i));
		}

		// Delsträng mellan två index
		System.out.println(str.substring(0, str.length() - 3));

		// Replace antingen tecken eller hela strängar
		System.out.println(str.replace('j', 'o'));
		System.out.println(str.replace("are", "tomas"));

		// Gör alla tecken till stora eller små bokstäver
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		// Jämföra med stora/små bokstäver
		if (str.toLowerCase().equals("hej")) {
			System.out.println("HEEEEEEJ");
		}
		if (str.toUpperCase().contains("HEJSAN")) {
			System.out.println("NÄMEN HEJSAN DU");
		}

		
		
		String space = "  hEj  ";
		// .trim() tar bort alla mellanslag i början och slutet
		if (space.trim().toLowerCase().equals("hej")) {
			System.out.println("HEJ PÅ DIG");
		}

		// Kolla första tecknet
		if (str.charAt(0) == 'A' || str.charAt(0) == 'a') {
			System.out.println("DU böRJAR PÅ A");
		}

		// Gör första bokstaven stor
		String firstUpper = str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
		System.out.println(firstUpper);

	}

}