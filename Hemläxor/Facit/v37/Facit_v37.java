import java.util.Scanner;

public class Facit_v37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vad heter du?");
		String name = input.nextLine();
		
		System.out.println("Hur gammal �r du?");
		int age = input.nextInt();
		input.nextLine(); // <-- buffer-kod som beh�vs f�r att nextInt() inte l�ser in n�sta rad, s� utan detta hoppar den �ver n�sta input-rad
		
		System.out.println("Vad �r din adress?");
		String address = input.nextLine();
		
		System.out.println("Vad �r ditt postnummer?");
		String postnumber = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String city = input.nextLine();
		
		System.out.println("Vad �r ditt telefonnummer?");
		String phoneNumber = input.nextLine();
		
		System.out.println();

		System.out.println("Vad heter du ? " + name);
		System.out.println("Hur gammal �r du ? " + age);
		System.out.println("Vad �r din adress ? " + address);
		System.out.println("Vad �r ditt postnummer ? " + postnumber);
		System.out.println("Vilken stad bor du i ? " + city);
		System.out.println("Vad �r ditt telefonnummer ? " + phoneNumber);
		
		System.out.println();
		
		System.out.println("Information: ");
		System.out.println("Namn:    " + name);
		System.out.println("�lder:   " + age);
		System.out.println("Address: " + address);
		System.out.println("         " + postnumber + " " + city);
		System.out.println("Telefon: " + phoneNumber);
		
	}

}
