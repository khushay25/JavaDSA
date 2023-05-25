package pattern;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = n / 2 + 1;
		int star = 1;

		while (row <= n) {
			for (int i = 1; i < space; i++) {
				System.out.print("  ");
			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}
			if (row < (n + 1) / 2) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}
			row++;
			System.out.println();
		}
	}

}
