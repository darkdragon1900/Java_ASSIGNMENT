package assignment1;

public class Q5 {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 6, 2, 7, 4, 2, 8, 4, 9, 3, 2 };

		
		for (int i = 0; i < arr.length; i++) {
			int count = 0; 
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			
			if (count == 0) {
				countOccurrences(arr, arr[i]);
			}
		}
	}

	
	public static void countOccurrences(int[] arr, int element) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
			}
		}
		System.out.println("Element " + element + " occurs " + count + " times.");
	}
}
