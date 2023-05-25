package patternprime;

import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int num = 1;
		int ntimes = 1;
		int space = n + 1;

		while (row <= n) {
			int i = 1;
			while (i <= ntimes) {
				System.out.print(num + " ");
				i++;
				num++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			int k = 1;
			if (row == n) {
				num = row - 1;
				ntimes--;
			} else {
				num = row;
			}
			while (k <= ntimes) {
				System.out.print(num + " ");
				num--;
				k++;
			}
			ntimes++;
			space -= 2;
			row++;
			num = 1;
			System.out.println();
		}
	}

}
