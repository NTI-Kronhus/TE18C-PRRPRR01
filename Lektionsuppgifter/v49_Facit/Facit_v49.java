import java.util.Scanner;

public class Facit_v49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[10]; //tom lista för alla namn
		String[] duplicateNames = new String[10]; //tom lista för dubbletter av namn
		
		//Tar in alla namn från konsolen
		System.out.println("Skriv in tio namn: ");
		for (int i = 0; i < names.length; i++) {
			names[i] = input.next();
		}
		
		//Loopar igenom listan för att kolla efter dubbletter
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			
			//Loopar igenom och jämför "name" med alla andra namn i listan
			for (int j = i + 1; j < names.length; j++) {
				String otherName = names[j];
				
				//Om det finns en dubblett kollar den om den redan hittat samma dubblett,
				//om den inte hittat dubbletten redan sparar den den i duplicateNames,
				//annars gör den ingenting
				if(name.equals(otherName)) {
					boolean duplicateAlreadyFound = false;
					
					for (String duplicateName : duplicateNames) {
						if(duplicateName != null) {
							if(duplicateName.equals(name)) {
								duplicateAlreadyFound = true;
							}
						}
					}
					
					if(!duplicateAlreadyFound) {
						duplicateNames[i] = name;
					}
				}
			}
		}
		
		//Skriver ut alla värden från listan duplicateNames som inte är null
		System.out.println("Namn som förekommer mer än en gång: ");
		for (String duplicateName : duplicateNames) {
			if(duplicateName != null) {
				System.out.print(duplicateName + ", ");
			}
		}
	}
}
