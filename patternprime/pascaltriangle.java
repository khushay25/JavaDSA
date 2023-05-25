package patternprime;

import java.util.Scanner;

public class pascaltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int num = 1;
		int row = 0;

		while (row < n) {
			num = 1;
			int j = 0;

			while (j <= row) {
				System.out.print(num + "\t");
				num = num * (row - j) / (j + 1);
				j++;
			}
			System.out.println();
			row++;
		}
	}
}
