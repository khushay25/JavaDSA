package pattern;

import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = 2 * n - 3;
		int star = 1;

		while (row <= n) {
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			for (int i = 0; i < space; i++) {
				System.out.print("  ");
			}
			int k = 1;
			if (row == n) {
				k = 2;
			} else {
				k = 1;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			star++;
			row++;
			System.out.println();
			space-=2;
		}
	}

}
