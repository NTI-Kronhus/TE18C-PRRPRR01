import java.util.Scanner;

public class Metoder_String {

	public static void main(String[] args) {

		// H�r nedan finns exempel p� ett flertal
		// inbyggda metoder i klassen String
		
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		// F�r att j�mf�ra str�ngar, anv�nd '.equals()', inte '=='.
		if (str.equals("Hej")) {
			System.out.println("HEJ");
		} else {
			System.out.println(str);
		}

		// Loopa igenom alla tecken i en String och g�r n�got med varje tecken
		int length = str.length();
		for (int i = 0; i < length; i++) {
			System.out.println("INDEX " + i + ": " + str.charAt(i));
		}

		// Delstr�ng mellan tv� index
		System.out.println(str.substring(0, str.length() - 3));

		// Replace antingen tecken eller hela str�ngar
		System.out.println(str.replace('j', 'o'));
		System.out.println(str.replace("are", "tomas"));

		// G�r alla tecken till stora eller sm� bokst�ver
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		// J�mf�ra med stora/sm� bokst�ver
		if (str.toLowerCase().equals("hej")) {
			System.out.println("HEEEEEEJ");
		}
		if (str.toUpperCase().contains("HEJSAN")) {
			System.out.println("N�MEN HEJSAN DU");
		}

		
		
		String space = "  hEj  ";
		// .trim() tar bort alla mellanslag i b�rjan och slutet
		if (space.trim().toLowerCase().equals("hej")) {
			System.out.println("HEJ P� DIG");
		}

		// Kolla f�rsta tecknet
		if (str.charAt(0) == 'A' || str.charAt(0) == 'a') {
			System.out.println("DU b�RJAR P� A");
		}

		// G�r f�rsta bokstaven stor
		String firstUpper = str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
		System.out.println(firstUpper);

	}

}