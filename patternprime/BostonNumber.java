package patternprime;

import java.util.Scanner;

public class BostonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int x = n;

		int fact = 0;
		int sum = 0;

		while (n % 2 == 0) {
			fact = fact + 2;
			n = n / 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				fact = fact + sod(i);
				n = n / i;
			}
		}
		if (n > 2) {
			fact = fact + sod(n);
		}

		if (sod(x) == fact) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public static int sod(int x) {
		int sum = 0;
		while (x > 0) {
			int rem = x % 10;
			sum = sum + rem;
			x = x / 10;
		}
		return sum;
	}

}
