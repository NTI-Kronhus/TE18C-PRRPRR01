import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		/*
		 * 		OBS
		 * Alla exempel nedan är till för att du ska
		 * lära dig syntax och hur try-catch fungerar, 
		 * det är inte korrekta användningsexempel
		 * 		 
		 */
		
		/*
		 * Try-satsen är koden du vill "försöka" köra,
		 * om du får ett exception (något gått fel) i try-satsen
		 * så körs catch-satsen. 
		 * 
		 * InputMismatchException e - är i det här fallet
		 * att man skrivit in något annan än en integer i konsolen
		 */
		System.out.println("EXEMPEL 1");
		
		try{
			in.nextInt();
		} catch (InputMismatchException e){
			System.out.println("Du skrev inte in en siffra.");
			in.nextLine(); //buffer
		}
		
		
		/*
		 * Den ovanstående koden fortsätter oavsett om det gått fel eller ej.
		 * 
		 * För att göra så att koden upprepas tills man fått rätt input kan
		 * man göra som nedanstående kod.
		 */
		System.out.println("EXEMPEL 2");
		
		int num = 0;
		while(true) {
			
			try{
				num = in.nextInt();
			} catch (InputMismatchException e){
				System.out.println("Felaktig input, vänligen försök igen.");
				in.nextLine(); //buffer
				continue; //startar om loopen
			}
			
			System.out.println("Du skrev in: " + num);
			break;
		}
		in.nextLine(); //buffer
		
		/*
		 * Du kan även "kasta" dina egna exceptions, ifall
		 * det inte finns inbyggt som det gör i .nextInt()
		 * 
		 * Testa att köra programmet och
		 * skriva in "Voldemort" i exempel 3
		 */
		
		System.out.println("EXEMPEL 3");
		String str = "";
		while(true) {
			
			try{
				str = in.nextLine();
				if(str.equals("Voldemort")) {
					throw new Exception("Man får inte säga det");
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
