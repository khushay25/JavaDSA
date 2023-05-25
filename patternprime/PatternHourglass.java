package patternprime;

import java.util.Scanner;

public class PatternHourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int num = n;
		int ntimes = 2 * n + 1;
		int space = 0;

		while (row <= 2 * n + 1) {
			for (int i = 0; i < space; i++) {
				System.out.print("  ");
			}
			int j = 1;
			while (j <= ntimes) {
				System.out.print(num + " ");
				j++;
				if (j > ntimes / 2 + 1) {
					num++;
				} else {
					num--;
				}
			}
			row++;
			if (row <= n + 1) {
				num = n - row + 1;
				ntimes -= 2;
				space++;
			} else {
				space--;
				ntimes += 2;
				num = row - n - 1;
			}
			System.out.println();
		}
	}

}
