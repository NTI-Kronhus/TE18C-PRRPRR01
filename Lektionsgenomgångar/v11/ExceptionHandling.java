import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		/*
		 * 		OBS
		 * Alla exempel nedan �r till f�r att du ska
		 * l�ra dig syntax och hur try-catch fungerar, 
		 * det �r inte korrekta anv�ndningsexempel
		 * 		 
		 */
		
		/*
		 * Try-satsen �r koden du vill "f�rs�ka" k�ra,
		 * om du f�r ett exception (n�got g�tt fel) i try-satsen
		 * s� k�rs catch-satsen. 
		 * 
		 * InputMismatchException e - �r i det h�r fallet
		 * att man skrivit in n�got annan �n en integer i konsolen
		 */
		System.out.println("EXEMPEL 1");
		
		try{
			in.nextInt();
		} catch (InputMismatchException e){
			System.out.println("Du skrev inte in en siffra.");
			in.nextLine(); //buffer
		}
		
		
		/*
		 * Den ovanst�ende koden forts�tter oavsett om det g�tt fel eller ej.
		 * 
		 * F�r att g�ra s� att koden upprepas tills man f�tt r�tt input kan
		 * man g�ra som nedanst�ende kod.
		 */
		System.out.println("EXEMPEL 2");
		
		int num = 0;
		while(true) {
			
			try{
				num = in.nextInt();
			} catch (InputMismatchException e){
				System.out.println("Felaktig input, v�nligen f�rs�k igen.");
				in.nextLine(); //buffer
				continue; //startar om loopen
			}
			
			System.out.println("Du skrev in: " + num);
			break;
		}
		in.nextLine(); //buffer
		
		/*
		 * Du kan �ven "kasta" dina egna exceptions, ifall
		 * det inte finns inbyggt som det g�r i .nextInt()
		 * 
		 * Testa att k�ra programmet och
		 * skriva in "Voldemort" i exempel 3
		 */
		
		System.out.println("EXEMPEL 3");
		String str = "";
		while(true) {
			
			try{
				str = in.nextLine();
				if(str.equals("Voldemort")) {
					throw new Exception("Man f�r inte s�ga det");
				}
			} catch (Exception e){
				System.out.println(e.getMessage());
				continue;
			}
			
			System.out.println("Du skrev in: " + str);
			break;
		}
	}

}
