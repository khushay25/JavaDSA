package pattern;

import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = n - 1;
		int num = 1;
		int ntimes = 1;

		while (row <= n) {
			for (int i = 0; i < space; i++) {
				System.out.print("  ");
			}
			int j = 1;
			while (j <= ntimes) {
				if (j == 1 || j == ntimes) {
					num = row;
				} else {
					num = 0;
				}
				System.out.print(num + " ");
				j++;
			}
			row++;
			System.out.println();
			ntimes += 2;
			space--;
		}
	}
}
