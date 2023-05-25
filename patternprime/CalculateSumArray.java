package patternprime;

import java.util.Scanner;

public class CalculateSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int opr = sc.nextInt();
		while (opr-- > 0) {
			int test = sc.nextInt();
			int[] brr = new int[n];
			for (int i = 0; i < n; i++) {
				int j = i - test;
				if (j < 0) {
					j = n + j;
				}
				brr[i] = arr[i] + arr[j];
			}
			arr = brr;
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}
		sum %= 100000007;
		System.out.println(sum);
	}
}
