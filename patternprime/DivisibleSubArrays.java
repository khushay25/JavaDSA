package patternprime;

import java.util.Scanner;

public class DivisibleSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int[] arr1 = new int[127];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(DivisibleSubArrays(n, arr));
		}

	}

	public static long DivisibleSubArrays(int n, int[] arr) {
		// TODO Auto-generated method stub
		long count = 0;
		long[] brr = new long[n];
		brr[0] = 1;
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			int idx = (int) (sum % n);
			if (idx < 0) {
				idx += n;
			}
			brr[idx] += 1;
		}
		for (int i = 0; i < n; i++) {
			if (brr[i] >= 2) {
				count += brr[i] * (brr[i] - 1) / 2;
			}
		}
		return count;
	}

}
