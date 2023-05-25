package patternprime;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		for (int i = n1; i <= n2; i++) {
			int count = 0;
			int num = 0;
			int rem = 0;
			int check = i;
			int check2 = i;

			while (check > 0) {
				check = check / 10;
				count++;
			}
			while (check2 > 0) {
				rem = check2 % 10;
				num = num + (int) Math.pow(rem, count);
				check2 = check2 / 10;
			}
			if (num == i) {
				System.out.println(num);
			}
		}
	}
}
