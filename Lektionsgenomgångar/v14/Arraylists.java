import java.util.ArrayList;

public class Arraylists {

	public static void main(String[] args) {

		//Hur man skapar en arraylist
		ArrayList<String> arr = new ArrayList<String>();

		//Vill du skriva ut hela listan kan du göra så här.
		System.out.println(arr);
		
		//I ArrayList-klassen finns inbyggda funktioner,
		//vill du få upp förslag på alla funktioner skriver
		//du namnet på listan, följt av en punkt. 
		//(T.ex. " arr. " så visas listan av funktioner.
		
		//Lägg till värden med .add()
		arr.add("Are");
		arr.add("Are");
		arr.add("Are");
		arr.add("Are");
		arr.add("Are");
		System.out.println(arr);
		
		//Lägg till på ett specifikt index
		arr.add(2, "Inte are");
		System.out.println(arr);
		//Hämta ett värde med .get(), som du sedan kan 
		//skriva ut om du vill
		System.out.println(arr.get(2));
		
		//Ta bort ett värde med .remove()
		//Antingen med ett visst värde:
		arr.remove("Inte are");
		//Eller på ett visst index:
		arr.remove(1);
		System.out.println(arr.toString());
		
		//Ändra ett värde med .set()
		arr.set(0, "Nya are");
		System.out.println(arr);
		
		//Rensa listan med .clear()
		arr.clear();
		System.out.println(arr.toString());
		
		//Det finns fler metoder, skriv bara 
		//listans namn och en punkt så får 
		//du upp alla förslag.
		//Testa dig fram!
		
	}

}
