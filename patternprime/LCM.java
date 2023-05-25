package patternprime;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		int divident = sc.nextInt();

		int n1 = divisor;
		int n2 = divident;

		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		int lcm = (n1 * n2) / divisor;
		System.out.println(lcm);
	}

}
