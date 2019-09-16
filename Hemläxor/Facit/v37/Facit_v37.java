import java.util.Scanner;

public class Facit_v37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		String name = input.nextLine();
		
		System.out.println("Hur gammal är du?");
		int age = input.nextInt();
		input.nextLine(); // <-- buffer-kod som behövs för att nextInt() inte läser in nästa rad, så utan detta hoppar den över nästa input-rad
		
		System.out.println("Vad är din adress?");
		String address = input.nextLine();
		
		System.out.println("Vad är ditt postnummer?");
		String postnumber = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String city = input.nextLine();
		
		System.out.println("Vad är ditt telefonnummer?");
		String phoneNumber = input.nextLine();
		
		System.out.println();

		System.out.println("Vad heter du ? " + name);
		System.out.println("Hur gammal är du ? " + age);
		System.out.println("Vad är din adress ? " + address);
		System.out.println("Vad är ditt postnummer ? " + postnumber);
		System.out.println("Vilken stad bor du i ? " + city);
		System.out.println("Vad är ditt telefonnummer ? " + phoneNumber);
		
		System.out.println();
		
		System.out.println("Information: ");
		System.out.println("Namn:    " + name);
		System.out.println("Ålder:   " + age);
		System.out.println("Address: " + address);
		System.out.println("         " + postnumber + " " + city);
		System.out.println("Telefon: " + phoneNumber);
		
	}

}
