package patternprime;

import java.util.Scanner;

public class patterntriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int num = 1;
		int ntimes = 1;
		int space = n - 1;

		while (row <= n) {
			for (int i = 0; i < space; i++) {
				System.out.print("\t");
			}
			int j = 1;
			while (j <= ntimes) {
				System.out.print(num + "\t");
				j++;
				if (j > row) {
					num--;
				} else {
					num++;
				}
			}
			row++;
			num = row;
			space--;
			ntimes += 2;
			System.out.println();
		}
	}
}
