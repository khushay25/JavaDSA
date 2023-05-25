package pattern;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int star = n;

		while (row <= n) {
			int j = 1;
			while (j <= star) {
				if (row == 1 || row == n || j == 1 || j == n) {
					System.out.print("* ");
					j++;
				} else {
					System.out.print("  ");
					j++;
				}
			}
			row++;
			System.out.println();
		}
	}

}
