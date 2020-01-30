import java.util.Scanner;

public class Uppgift_7 {

	public static void main(String[] args) {
		
		System.out.println(timeToSeconds(getNumberOfType("hours"), getNumberOfType("minutes"), getNumberOfType("seconds")));
		
	}
	
	public static int getNumberOfType(String numberType) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a " + numberType + ": ");
		return input.nextInt();
	}
	
	public static int timeToSeconds(int hours, int minutes, int seconds) {
		return hoursToSeconds(hours) + minutesToSeconds(minutes) + seconds;
	}

	public static int hoursToSeconds(int hours) {
		return hours * 3600;
	}
	
	public static int minutesToSeconds(int minutes) {
		return minutes * 60;
	}
}
