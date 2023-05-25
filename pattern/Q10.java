package pattern;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = 0;
		int star = 2 * n - 1;

		while (row <= n) {
			for (int i = 0; i < space; i++) {
				System.out.print("  ");
			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			row++;
			space++;
			star -= 2;
			System.out.println();
		}
	}

}
