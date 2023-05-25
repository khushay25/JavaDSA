package patternprime;

import java.util.Scanner;

public class PatternNumberLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int num = 1;
		int ntimes = 1;

		while (row <= n) {
			int j = 1;
			while (j <= ntimes) {
				System.out.print(num + "\t");
				num++;
				j++;
			}
			ntimes++;
			row++;
			System.out.println();
		}
	}

}
