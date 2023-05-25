package patternprime;

import java.util.Scanner;

public class PatternInvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int num = n;
		int ntimes = 1;
		int space = 2 * n - 1;

		while (row <= 2 * n + 1) {
			int i = 1;
			while (i <= ntimes) {
				System.out.print(num + " ");
				i++;
				num--;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if (row == n + 1) {
				num++;
				k = 2;
			}
			while (k <= ntimes) {
				num++;
				System.out.print(num + " ");
				k++;
			}
			if (row <= n) {
				ntimes++;
				space -= 2;
			} else {
				ntimes--;
				space += 2;
			}
			row++;
			num = n;
			System.out.println();
		}
	}
}
