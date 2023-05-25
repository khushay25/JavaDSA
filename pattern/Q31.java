package pattern;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int num = n;
		int ntimes = n;

		while (row <= n) {
			int i = 1;
			while (i <= ntimes) {
				if (num == row) {
					System.out.print("* ");
				} else {
					System.out.print(num + " ");
				}
				num--;
				i++;
			}
			row++;
			num = n;
			System.out.println();
		}
	}

}
