package pattern;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = n - 1;
		int star = 1;

		while (row <= 2 * n - 1) {
			for (int i = 0; i < space; i++) {
				System.out.print("  ");
			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			if (row < n) {
				star++;
				space--;
			} else {
				star--;
				space++;
			}
			row++;
			System.out.println();
		}
	}

}
