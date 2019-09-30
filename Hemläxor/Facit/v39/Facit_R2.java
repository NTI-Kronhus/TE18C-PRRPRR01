import java.util.Scanner;

public class Facit_R2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int r1 = input.nextInt();
		int s = input.nextInt();
		
		int r2 = s*2 - r1;
		
		System.out.println(r2);

	}

}
