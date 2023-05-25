package patternprime;

import java.util.Scanner;

public class MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(MaxValue(arr, n));
	}

	public static int MaxValue(int[] arr, int n) {
		int max = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		return arr[max];
	}
}