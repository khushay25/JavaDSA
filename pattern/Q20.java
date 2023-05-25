package pattern;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = n / 2 + 1;
		int bspace = -1;
		int star = 1;

		while (row <= n) {
			for (int i = 1; i < space; i++) {
				System.out.print("  ");
			}

			System.out.print("* ");

			int k = 1;
			while (k <= bspace) {
				System.out.print("  ");
				k++;
			}

			if (row == 1 || row == n) {
				System.out.print("");
			} else {
				System.out.print("* ");
			}

			if (row < (n + 1) / 2) {
				space--;
				bspace += 2;
				star++;
			} else {
				space++;
				bspace -= 2;
				star++;
			}

			row++;
			System.out.println("");
		}
	}
}
