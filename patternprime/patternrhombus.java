package patternprime;

import java.util.Scanner;

public class patternrhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int num = 1;
		int ntimes = 1;
		int space = n - 1;

		while (row <= 2 * n - 1) {
			for (int i = 0; i < space; i++) {
				System.out.print("\t");
			}
			int j = 1;
			while (j <= ntimes) {
				System.out.print(num + "\t");
				if (j <= ntimes / 2) {
					num++;
				} else {
					num--;
				}
				j++;
			}
			row++;
			if (row <= n) {
				space--;
				ntimes += 2;
				num = row;
			} else {
				space++;
				ntimes -= 2;
			}
			System.out.println();
		}
	}

}
