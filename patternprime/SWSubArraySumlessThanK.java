package patternprime;

import java.util.Scanner;

public class SWSubArraySumlessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(SumLessThanK(arr, n, k));

	}

	public static int SumLessThanK(int[] arr, int n, int k) {
		// TODO Auto-generated method stub

	}

}
