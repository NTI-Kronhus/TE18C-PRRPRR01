
public class Facit_v43 {

	public static void main(String[] args) {

		//Test-exempel:
		
		System.out.println(volume(5.15));
		
		System.out.println(reverse("Hej svej!"));
		
		System.out.println(count("Hej svej!", 'e'));
		
		System.out.println(sjorovare("Hej JaoK!"));
		
	}

	
	
	/**
	 * 
	 * Uppgift 1:
	 * 
	 * This method calculates the volume of a sphere with the given radius.
	 * 
	 * @param radius The radius of the sphere.
	 * @return The volume of the sphere.
	 */
	public static double volume(double radius) {
		return (4 * Math.pow(radius, 3))/3;
	}
	
	
	
	/**
	 * 
	 * Uppgift 2:
	 * 
	 * This method reverses the given string (returns it backwards).
	 * 
	 * @param stringToReverse The string to be reversed.
	 * @return The reversed version of the given string.
	 */
	public static String reverse(String stringToReverse) {
		String reversedString = "";
		
		for (int i = stringToReverse.length() - 1; i >= 0; i--) {
			reversedString += stringToReverse.charAt(i);
		}
		
		return reversedString;
	}
	
	
	
	/**
	 * 
	 * Uppgift 3:
	 * 
	 * This method searches the given string for the given character, 
	 * and returns the amount of times the char appears in the string.
	 * 
	 * @param stringToSearch The string to be searched.
	 * @param charToCheckFor The char to check for in the given string.
	 * @return The amount of times charToCheckFor appears in stringToSearch.
	 */
	public static int count(String stringToSearch, char charToCheckFor) {
		int charCounter = 0;
		
		for (int i = 0; i < stringToSearch.length(); i++) {
			if(stringToSearch.charAt(i) == charToCheckFor) {
				charCounter++;
			}
		}
		
		return charCounter;
	}
	
	
	
	/**
	 * 
	 * Uppgift 4:
	 * 
	 * This method returns the given string translated into Sjörövar-language.
	 * 
	 * @param str The unchanged string to be modified.
	 * @return The translated string.
	 */
	public static String sjorovare(String str) {
		String sjorovarStr = "";
		String lowerCaseStr = str.toLowerCase(); 
		
		for(int i = 0; i < str.length(); i++) {
			sjorovarStr += str.charAt(i);
			
			char c = lowerCaseStr.charAt(i);
			if(c == 'b' || c == 'c' || c == 'd' || c == 'f' || 
				c == 'g' || c == 'h' || c == 'j' || c == 'k' || 
				c == 'l' || c == 'm' || c == 'n' || c == 'p' || 
				c == 'q' || c == 'r' || c == 's' || c == 't' || 
				c == 'v' || c == 'x' || c == 'z') {
				sjorovarStr += ("o" + c);
			} 
		}
		
		return sjorovarStr;
	}
	
}
