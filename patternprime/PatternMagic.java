package patternprime;

import java.util.Scanner;

public class PatternMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int star = n;
		int space = -1;

		while (row <= 2 * n - 1) {
			int j = 1;
			while (j <= star) {
				System.out.print("*");
				j++;
			}
			int i = 1;
			while (i <= space) {
				System.out.print(" ");
				i++;
			}
			int k = 1;
			if (row == 1 || row == 2 * n - 1) {
				k = 2;
			} else {
				k = 1;
			}
			while (k <= star) {
				System.out.print("*");
				k++;
			}
			row++;
			if (row > n) {
				space -= 2;
				star++;
			} else {
				space += 2;
				star--;
			}
			System.out.println();
		}
	}

}
