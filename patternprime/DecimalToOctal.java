package patternprime;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int mul = 1;
		int sum = 0;

		while (n > 0) {
			int rem = n % 8;
			sum = sum + rem * mul;
			n = n / 8;
			mul = mul * 10;
		}
		System.out.println(sum);
	}

}
