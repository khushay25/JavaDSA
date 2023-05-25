package patternprime;

import java.util.Scanner;

public class PatternWithZeros {

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
				if (j == 1 || j == ntimes) {
					System.out.print(num + "\t");
				} else {
					System.out.print("0\t");
				}
				j++;
			}
			row++;
			num = row;
			ntimes++;
			System.out.println();
		}
	}

}
