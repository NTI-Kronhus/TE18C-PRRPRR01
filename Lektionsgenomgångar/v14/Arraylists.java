import java.util.ArrayList;

public class Arraylists {

	public static void main(String[] args) {

		//Hur man skapar en arraylist
		ArrayList<String> arr = new ArrayList<String>();

		//Vill du skriva ut hela listan kan du g�ra s� h�r.
		System.out.println(arr);
		
		//I ArrayList-klassen finns inbyggda funktioner,
		//vill du f� upp f�rslag p� alla funktioner skriver
		//du namnet p� listan, f�ljt av en punkt. 
		//(T.ex. " arr. " s� visas listan av funktioner.
		
		//L�gg till v�rden med .add()
		arr.add("Are");
		arr.add("Are");
		arr.add("Are");
		arr.add("Are");
		arr.add("Are");
		System.out.println(arr);
		
		//L�gg till p� ett specifikt index
		arr.add(2, "Inte are");
		System.out.println(arr);
		//H�mta ett v�rde med .get(), som du sedan kan 
		//skriva ut om du vill
		System.out.println(arr.get(2));
		
		//Ta bort ett v�rde med .remove()
		//Antingen med ett visst v�rde:
		arr.remove("Inte are");
		//Eller p� ett visst index:
		arr.remove(1);
		System.out.println(arr.toString());
		
		//�ndra ett v�rde med .set()
		arr.set(0, "Nya are");
		System.out.println(arr);
		
		//Rensa listan med .clear()
		arr.clear();
		System.out.println(arr.toString());
		
		//Det finns fler metoder, skriv bara 
		//listans namn och en punkt s� f�r 
		//du upp alla f�rslag.
		//Testa dig fram!
		
	}

}
