package patternprime;

import java.util.Scanner;

public class ChewbaccaAndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		System.out.println(invnum(n));
	}

	public static long invnum(long n) {
		long sum = 0;
		long mul = 1;
		while (n > 0) {
			long rem = n % 10;
			if (rem >= 5 && n != 9) {
				sum += (9 - rem) * mul;
			} else {
				sum = sum + rem * mul;
			}
			n = n / 10;
			mul = mul * 10;
		}
		return (sum);
	}

}
