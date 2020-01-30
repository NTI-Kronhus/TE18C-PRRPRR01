
public class Uppgift_10 {

	public static void main(String[] args) {

		int[] testArray = {5, 6, 7, 6, 7, 8, 9, 7};
		
		printArray(getDoublets(testArray));
		
	}

	public static int[] getDoublets(int[] arrayToCheck) {
		int[] result = new int[arrayToCheck.length];
		
		for(int i = 0; i < arrayToCheck.length; i++) {
			int num = arrayToCheck[i];
			
			for (int j = i + 1; j < arrayToCheck.length; j++) {
				int comparingNum = arrayToCheck[j];
				boolean alreadyAdded = false;
				
				for (int doublet : result) {
					if(doublet == num) {
						alreadyAdded = true;
						break;
					}
				}
				
				if(!alreadyAdded && num == comparingNum) {
					result[i] = num;
				}
			}
		}
		
		return result;
	}
	
	public static void printArray(int[] arrayToPrint) {
		System.out.println();
		for (int num : arrayToPrint) {
			if(num != 0) {
				System.out.print(num + ", ");
			}
		}
		System.out.println();
	}
	
}
