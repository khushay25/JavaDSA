package patternprime;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int idx = sc.nextInt();
		System.out.println(BinarySearch(arr, n, idx));
	}

	public static int BinarySearch(int[] arr, int n, int idx) {
		int si = 0;
		int ei = n - 1;
		while (si <= ei) {
			int mid = (ei + si) / 2;
			if (arr[mid] == idx) {
				return mid;
			} else if (arr[mid] > idx) {
				ei = mid - 1;
			} else {
				si = mid + 1;
			}
		}
		return -1;
	}
}
