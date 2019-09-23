import java.util.Scanner;

public class Facit_v38_utan_loop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Samla in talen
		System.out.print("Skriv in tio heltal: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		int g = input.nextInt();
		int h = input.nextInt();
		int i = input.nextInt();
		int j = input.nextInt();

		//Räkna ut högsta
		int highest = a;
		
		if(highest < b) {
			highest = b;
		}
		if(highest < c) {
			highest = c;
		}
		if(highest < d) {
			highest = d;
		}
		if(highest < e) {
			highest = e;
		}
		if(highest < f) {
			highest = f;
		}
		if(highest < g) {
			highest = g;
		}
		if(highest < h) {
			highest = h;
		}
		if(highest < i) {
			highest = i;
		}
		if(highest < j) {
			highest = j;
		}
		
		
		//Räkna ut lägsta
		int lowest = a;
		
		if(lowest > b) {
			lowest = b;
		}
		if(lowest > c) {
			lowest = c;
		}
		if(lowest > d) {
			lowest = d;
		}
		if(lowest > e) {
			lowest = e;
		}
		if(lowest > f) {
			lowest = f;
		}
		if(lowest > g) {
			lowest = g;
		}
		if(lowest > h) {
			lowest = h;
		}
		if(lowest > i) {
			lowest = i;
		}
		if(lowest > j) {
			lowest = j;
		}
		
		double average = (a+b+c+d+e+f+g+h+i+j) / 10.0; // se till att få med 10.0 (inte bara 10), annars avrundas medelvärdet nedåt till närmsta heltal
		
		System.out.println("Högst: " + highest);
		System.out.println("Lägst: " + lowest);
		System.out.println("Medelvärde: " + average);
	}

}
