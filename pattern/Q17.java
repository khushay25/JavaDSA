package pattern;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int star = n / 2;
		int space = 1;

		while (row <= n) {
			for (int i = 0; i < star; i++) {
				System.out.print("* ");
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			if (row <= n / 2) {
				space += 2;
				star--;
			} else {
				space -= 2;
				star++;
			}
			row++;
			System.out.println();
		}
	}
}
