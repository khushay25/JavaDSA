package strings;

import java.util.Scanner;

public class TEST2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int mrem = 0;
		int nrem = 0;
		int num1 = 0;
		int num2 = 0;
		int i = 0;
		while (n > 0 && m > 0) {
			mrem = m % 10;
			nrem = n % 10;
			if (nrem > mrem) {
				num1 += nrem * Math.pow(10, i);
				num2 += 0 * Math.pow(10, i);
			} else if (nrem < mrem) {
				num1 += 0 * Math.pow(10, i);
				num2 += mrem * Math.pow(10, i);
			} else {
				num1 += nrem * Math.pow(10, i);
				num2 += mrem * Math.pow(10, i);
			}
			i++;
			n /= 10;
			m /= 10;
		}
		if (num1 == 0) {
			System.out.println("YODA");
			System.out.println(num2);
		} else if (num2 == 0) {
			System.out.println(num1);
			System.out.println("YODA");
		} else {
			System.out.println(num1);
			System.out.println(num2);
		}
	}
}
