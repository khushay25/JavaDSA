package patternprime;

import java.util.Scanner;

public class mirrorstarpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int star = 1;
		int space = n / 2;

		while (row <= n) {
			for (int i = 0; i < space; i++) {
				System.out.print("\t");
			}
			int j = 1;
			while (j <= star) {
				System.out.print("*\t");
				j++;
			}
			if (row < n / 2 + 1) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}
			row++;
			System.out.println();
		}
	}

}
