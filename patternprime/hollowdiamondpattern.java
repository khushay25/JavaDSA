package patternprime;

import java.util.Scanner;

public class hollowdiamondpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int star = n / 2 + 1;
		int space = -1;

		while (row <= n) {
			int j = 1;
			while (j <= star) {
				System.out.print("*\t");
				j++;
			}
			for (int i = 0; i < space; i++) {
				System.out.print("\t");
			}
			int k = 1;
			if (row == 1 || row == n) {
				k = 2;
			} else {
				k = 1;
			}
			while (k <= star) {
				System.out.print("*\t");
				k++;
			}
			if (row > n / 2) {
				space -= 2;
				star++;
			} else {
				space += 2;
				star--;
			}
			row++;
			System.out.println();
		}
	}

}
