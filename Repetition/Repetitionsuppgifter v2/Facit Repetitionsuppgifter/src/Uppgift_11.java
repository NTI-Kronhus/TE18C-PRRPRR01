import java.util.Scanner;

public class Uppgift_11 {

	public static void main(String[] args) {
		
		printStrArray(findDuplicates(getStringArray(4, "name")));

	}
	
	public static String[] getStringArray(int size, String stringType) {
		Scanner in = new Scanner(System.in);
		
		String[] strArray = new String[size];
		
		System.out.println("Please enter " + size + " " + stringType + "s: ");
		for (int i = 0; i < size; i++) {
			strArray[i] = in.next();
		}
		
		return strArray;
	}
	
	public static String[] findDuplicates(String[] arrayToCheck) {

		String[] duplicates = new String[arrayToCheck.length];

		for (int i = 0; i < arrayToCheck.length; i++) {
			String str = arrayToCheck[i];
			
			for (int j = i + 1; j < arrayToCheck.length; j++) {
				String comparingStr = arrayToCheck[j];
				
				if(str.equals(comparingStr)) {
					boolean duplicateAlreadyFound = false;
					
					for (String duplicateName : duplicates) {
						if(duplicateName != null) {
							if(duplicateName.equals(str)) {
								duplicateAlreadyFound = true;
							}
						}
					}
					
					if(!duplicateAlreadyFound) {
						duplicates[i] = str;
					}
				}
			}
		}
		
		return duplicates;
	}
	
	public static void printStrArray(String[] array) {
		for (String str : array) {
			if(str != null) {
				System.out.print(str + ", ");
			}
		}
	}

}
