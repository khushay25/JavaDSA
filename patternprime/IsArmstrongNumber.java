package patternprime;

import java.util.Scanner;

public class IsArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(isarmstrongno(n));
	}

	public static boolean isarmstrongno(int n) {
		// TODO Auto-generated method stub
		int count = 0;
		int rem = 0;
		int num = 0;
		int check = n;
		int check2 = n;

		while (n > 0) {
			n = n / 10;
			count++;

		}

		while (check > 0) {
			rem = check % 10;
			num = num + (int) Math.pow(rem, count);
			check = check / 10;
		}
		if (num == check2) {
			return true;
		}
		return false;
	}
}
