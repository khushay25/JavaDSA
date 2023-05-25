package pattern;

import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = n - 1;
		int ntimes = 1;

		while (row <= n) {
			for (int i = 0; i < space; i++) {
				System.out.print("  ");
			}
			int j = 1;
			while (j <= ntimes) {
				int num = n;
				if (j > row) {
					num = num + row - j;
					System.out.print(num + " ");
				} else if (j == row) {
					System.out.print("0 ");
				} else {
					num = num - row + j;
					System.out.print(num + " ");
				}
				j++;
			}
			/*
			 * if (row > n) { num = n - row + 1; } else {
			 */
			row++;
			ntimes += 2;
			space--;
			System.out.println();
		}
	}
}
