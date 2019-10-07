import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int hours = input.nextInt();
		int minutes = input.nextInt();
		
		minutes -= 45;
		
		if(minutes < 0) {
			hours--;
			minutes += 60;

			if (hours < 0) {
				hours += 24;
			}
		}
		
		
		System.out.println(hours + " " + minutes);

	}

}
