package patternprime;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int fact = 0;
		int i = 2;

		while (i < n) {
			if (n % i == 0) {
				fact++;
				break;
			}
			i++;
		}
		if (fact >= 1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}

}
