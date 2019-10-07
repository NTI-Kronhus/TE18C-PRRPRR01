import java.util.Scanner;

public class Modulo_UsingArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] numArr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		int distinctValues = 0;
		
		for(int i = 0; i < 10; i++) {
			int tempNum = input.nextInt() % 42;
			
			boolean contains = false;
			for(int num : numArr) {
				if(num == tempNum) {
					contains = true;
					break;
				}
			}
			
			if(!contains) {
				numArr[i] = tempNum;
				distinctValues++;
			}
		}
		
		System.out.println(distinctValues);

	}

}
