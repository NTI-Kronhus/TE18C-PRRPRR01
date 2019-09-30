import java.util.Scanner;

public class Facit_quadrant {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int y = input.nextInt();
		
		int quadrant = 0;

		if(x > 0) {
			if(y > 0) {
				quadrant = 1;
			} else {
				quadrant = 4;
			}
		} else {
			if(y > 0) {
				quadrant = 2;
			} else {
				quadrant = 3;
			}
		}
		
		System.out.println(quadrant);
		
	}

}
