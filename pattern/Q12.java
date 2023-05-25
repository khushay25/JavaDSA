package pattern;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int star = 1;
		int space = n - 1;

		while (row <= n) {
			for (int i = 0; i < space; i++) {
				System.out.print("  ");
			}
			int j = 1;
			while (j <= star) {
				if (j % 2 == 0) {
					System.out.print("! ");
				} else {
					System.out.print("* ");
				}
				j++;
			}
			row++;
			space--;
			star += 2;
			System.out.println();
		}
	}

}
