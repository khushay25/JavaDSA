package pattern;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;

		while (row <= n) {
			int i = 1;
			while (i <= n) {
				if (i == row || row + i == n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				i++;
			}
			row++;
			System.out.println();
		}
	}
}
