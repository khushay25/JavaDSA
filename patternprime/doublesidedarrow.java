package patternprime;

import java.util.Scanner;

public class doublesidedarrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1 2 1 1 2 3 2 1 1 2 3 4 3 2 1 1 2 3 4 3 2 1 1 2 3 2 1 1 2 1
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int num = 1;
		int ntimes = 1;
		int bspace = -1;
		int space = n - 1;

		while (row <= n) {
			for (int i = 0; i < space; i++) {
				System.out.print("  ");
			}
			int j = 1;
			while (j <= ntimes) {
				System.out.print(num + " ");
				j++;
				num--;
			}
			for (int i = 0; i < bspace; i++) {
				System.out.print("  ");
			}
			int k = 1;
			if (row == 1 || row == n) {
				k = 2;
			} else {
				k = 1;
			}
			num = 1;
			while (k <= ntimes) {
				System.out.print(num + " ");
				k++;
				num++;
			}
			row++;
			if (row <= n / 2 + 1) {
				space -= 2;
				bspace += 2;
				ntimes++;
				num = row;
			} else {
				space += 2;
				bspace -= 2;
				ntimes--;
				num = n - row + 1;
			}
			System.out.println();
		}
	}

}
