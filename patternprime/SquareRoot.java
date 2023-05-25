package patternprime;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((sqrt(n)));
	}

	public static int sqrt(int n) {
		if (n == 0) {
			return 0;
		} else {
			int si = 1;
			int ei = n;
			int ans = 0;
			while (si <= ei) {
				int mid = (ei - si) / 2 + si;
				if (mid <= n / mid) {
					ans = mid;
					si = mid + 1;
				} else {
					ei = mid - 1;
				}

			}
			return ans;
		}
	}
}
