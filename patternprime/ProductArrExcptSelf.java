package patternprime;

import java.util.Scanner;

public class ProductArrExcptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		long[] brr = new long[n];

		ProductOfArray(arr, n, brr);

		for (int i = 0; i < n; i++) {
			System.out.print(brr[i] + " ");
		}
	}

	public static long[] ProductOfArray(long[] arr, int n, long[] brr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			long product = 1;
			for (int j = 0; j < i; j++) {
				product *= arr[j];
			}
			for (int j = i + 1; j < n; j++) {
				product *= arr[j];
			}
			brr[i] = product;
		}
		return brr;
	}

}
