package patternprime;

import java.util.Scanner;

public class CountReccuringDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = sc.nextInt();

		int count = 0;

		while (n > 0) {
			int rem = n % 10;
			if (num == rem) {
				count++;
			}
			n = n / 10;
		}
		System.out.println(count);
	}

}
