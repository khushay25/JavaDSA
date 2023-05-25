package patternprime;

import java.util.Scanner;

public class FibonacciPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int numa = 0;
		int numb = 1;
		int ntimes = 1;

		while (row <= n) {
			int j = 1;
			while (j <= ntimes) {
				int numc = numa + numb;
				System.out.print(numa + "\t");
				j++;
				numa = numb;
				numb = numc;
			}
			row++;
			ntimes++;
			System.out.println();
		}
	}

}
