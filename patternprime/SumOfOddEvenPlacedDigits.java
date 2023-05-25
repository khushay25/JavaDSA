package patternprime;

import java.util.Scanner;

public class SumOfOddEvenPlacedDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int SumOdd = 0;
		int SumEven = 0;
		int pos = 1;

		while (n > 0) {
			int rem = n % 10;
			if (pos % 2 == 0) {
				SumEven = SumEven + rem;
			} else {
				SumOdd = SumOdd + rem;
			}
			n = n / 10;
			pos++;
		}
		System.out.println(SumOdd);
		System.out.println(SumEven);
	}
}
