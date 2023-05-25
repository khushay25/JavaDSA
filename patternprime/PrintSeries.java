package patternprime;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ntimes = sc.nextInt();
		int n = sc.nextInt();

		for (int i = 1; i < ntimes + 1; i++) {
			int output = 3 * i + 2;
			if (output % n != 0) {
				System.out.println(output);
			} else {
				ntimes++;
			}
		}
	}

}
