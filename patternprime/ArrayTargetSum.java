package patternprime;

import java.util.Scanner;

public class ArrayTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int tgtsum = sc.nextInt();

		TgtSum(arr, n, tgtsum);
	}

	public static void TgtSum(int[] arr, int n, int tgtsum) {
		// TODO Auto-generated method stub

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				if (arr[i] + arr[j] == tgtsum) {
					System.out.println(Math.min(arr[i], arr[j]) + " and " + Math.max(arr[i], arr[j]));
				}
			}
		}
	}
}