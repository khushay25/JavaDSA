package pattern;

import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int num = 1;
		int ntimes = 1;

		while (row <= 2 * n - 1) {
			int i = 1;
			while (i <= ntimes) {
				if (i == row || i == 2 * n - row) {
					System.out.print(num + " ");
				} else {
					System.out.print(num + " * ");
				}
				i++;
			}
			if (row < n) {
				ntimes++;
				num++;
			} else {
				num--;
				ntimes--;
			}
			row++;
			System.out.println();
		}
	}

}
