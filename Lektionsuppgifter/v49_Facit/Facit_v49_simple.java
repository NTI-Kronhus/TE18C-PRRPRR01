import java.util.Scanner;

public class Facit_v49_simple {

	public static void main(String[] args) {

		/*
		 * Den h�r koden fungerar men inte helt, 
		 * eftersom den skriver ut ett v�rde flera g�nger
		 * om man har tre eller fler av samma v�rde.
		 * 
		 * Dock �r den kanske lite enklare att f�rst�
		 * och ni kan b�rja med att f�rst� detta, sedan 
		 * g� vidare till den "riktiga" l�sningen
		 */
		
		Scanner in = new Scanner(System.in);
		
		String[] names = new String[10];
		
		for (int i = 0; i < names.length; i++) {
			names[i] = in.next();
		}
		
		for (int i = 0; i < names.length; i++) {
			
			for (int j = i + 1; j < names.length; j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println(names[i]);
				}
				
			}
			
		}
	}

}
