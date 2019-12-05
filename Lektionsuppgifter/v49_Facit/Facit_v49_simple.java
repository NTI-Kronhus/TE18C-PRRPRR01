import java.util.Scanner;

public class Facit_v49_simple {

	public static void main(String[] args) {

		/*
		 * Den här koden fungerar men inte helt, 
		 * eftersom den skriver ut ett värde flera gånger
		 * om man har tre eller fler av samma värde.
		 * 
		 * Dock är den kanske lite enklare att förstå
		 * och ni kan börja med att förstå detta, sedan 
		 * gå vidare till den "riktiga" lösningen
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
