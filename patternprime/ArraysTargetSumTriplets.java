package patternprime;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int tgt = sc.nextInt();

		TgtSumTriplet(arr, n, tgt);
	}

	public static void TgtSumTriplet(int[] arr, int n, int tgt) {
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == tgt) {
						System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
					}
				}
			}
		}
	}
}
