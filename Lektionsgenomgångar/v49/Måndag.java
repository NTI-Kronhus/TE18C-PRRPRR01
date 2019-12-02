
public class Måndag {

	public static void main(String[] args) {

		//Olika sätt att SKAPA listor på:
		int[] arr = {1, 2, 3};
		
		int[] arr2 = new int[5]; //Skapar en tom lista
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
		
		//Skapar en tom array och fyller den med hjälp av en for-loop
		int[] fivers3 = new int[20];
		for(int i = 0; i < 20; i++) {
			fivers3[i] = i *5; //Fyller listan med femmans gångertabell
		}

		//Skriver ut hela listan
		for (int i = 0; i < fivers3.length; i++) {
			System.out.print(fivers3[i] + ", "); 
		}
		System.out.println();
		
		//Skriver ut hela listan, men med hjälp av en "foreach"-loop
		for (int fiver : fivers3) { 
			System.out.print(fiver + ", ");
		}
		System.out.println();
		
		//Arrays kan innehålla andra värden än heltal...
		//t.ex. doubles
		double[] darr = {1.5, 1.6};
		//eller Strings
		String[] sarr = {"Are", "Fabian", "Jeffrey", "Hugo"};
		
		//Söker genom listan med namn och skriver ut om det är Hugo eller inte
		for (String name : sarr) {
			if(name == "Hugo") {
				System.out.println("Detta är hugo");
			} else {
				System.out.println("Detta är någon annan");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
