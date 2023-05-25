package patternprime;

import java.util.Scanner;

public class HollowRhombusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space = n - 1;
		int star = n;

		while (row <= 2 * n - 1) {
			if (row % 2 == 0) {
				System.out.println();
			} else {
				for (int i = 0; i < space; i++) {
					System.out.print(" ");
				}
				int j = 1;
				if (row == 1 || row == 2 * n - 1) {
					while (j <= star) {
						System.out.print("*");
						j++;
					}
				} else {
					while (j <= star) {
						if (j == 1 || j == star) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
						j++;
					}
				}
			}
			row++;
			if (row % 2 == 0) {
				System.out.println();
			} else {
				space--;
			}
		}
	}
}
