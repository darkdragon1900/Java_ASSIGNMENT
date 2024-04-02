package assignment1;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int[] arr = { 5, 3, 9, 1, 7, 2, 8, 4, 6 };

			int max = Integer.MIN_VALUE;
			int secondMax = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int secondMin = Integer.MAX_VALUE;

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					secondMax = max;
					max = arr[i];
				} else if (arr[i] > secondMax && arr[i] != max) {
					secondMax = arr[i];
				}

				if (arr[i] < min) {
					secondMin = min;
					min = arr[i];
				} else if (arr[i] < secondMin && arr[i] != min) {
					secondMin = arr[i];
				}
			}

			System.out.println("Second Maximum Element: " + secondMax);
			System.out.println("Second Minimum Element: " + secondMin);
		}
	}

}
