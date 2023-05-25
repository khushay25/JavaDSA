package patternprime;

import java.util.Scanner;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();

		System.out.println(LinearSearch(arr, n, m));
	}

	public static int LinearSearch(int[] arr, int n, int m) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			if (m == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
