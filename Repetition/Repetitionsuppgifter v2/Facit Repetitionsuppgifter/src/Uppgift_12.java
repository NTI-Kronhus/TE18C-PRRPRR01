
public class Uppgift_12 {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] arr2 = {2, 3, 4, 1};
		int[] arr3 = {5, 40, 3, 55, -2, -67, 0, 8};

		bubbleSort(arr1);
		bubbleSort(arr2);
		bubbleSort(arr3);

		printIntArray(arr1);
		printIntArray(arr2);
		printIntArray(arr3);

	}

	public static void bubbleSort(int[] arrayToSort) {
		boolean hasSwapped = true;
		
		for (int i = 0; i < arrayToSort.length && hasSwapped; i++) {
			hasSwapped = false;
			
			for (int j = 0; j < arrayToSort.length - 1 - i; j++) {
				if (arrayToSort[j] > arrayToSort[j + 1]) {
					int temp = arrayToSort[j + 1];
					arrayToSort[j + 1] = arrayToSort[j];
					arrayToSort[j] = temp;
					hasSwapped = true;
				}
			}
		}
	}
	
	public static void printIntArray(int[] array) {
		System.out.println();
		for (int num : array) {
			System.out.print(num + ", ");
		}
	}
}
