import java.util.Scanner;

public class Facit_v49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[10]; //tom lista f�r alla namn
		String[] duplicateNames = new String[10]; //tom lista f�r dubbletter av namn
		
		//Tar in alla namn fr�n konsolen
		System.out.println("Skriv in tio namn: ");
		for (int i = 0; i < names.length; i++) {
			names[i] = input.next();
		}
		
		//Loopar igenom listan f�r att kolla efter dubbletter
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			
			//Loopar igenom och j�mf�r "name" med alla andra namn i listan
			for (int j = i + 1; j < names.length; j++) {
				String otherName = names[j];
				
				//Om det finns en dubblett kollar den om den redan hittat samma dubblett,
				//om den inte hittat dubbletten redan sparar den den i duplicateNames,
				//annars g�r den ingenting
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
		
		//Skriver ut alla v�rden fr�n listan duplicateNames som inte �r null
		System.out.println("Namn som f�rekommer mer �n en g�ng: ");
		for (String duplicateName : duplicateNames) {
			if(duplicateName != null) {
				System.out.print(duplicateName + ", ");
			}
		}
	}
}
