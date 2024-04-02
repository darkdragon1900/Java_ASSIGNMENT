package assignment1;

public class Q1e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 6;

		int row = 5, space = 4;
		int star = 1, i, j, x;

		for (i = 1; i <= row; i++) {
			for (int k = 1; k <= space; k++) {
				System.out.print(" ");
			}

			for (j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
	}

}
