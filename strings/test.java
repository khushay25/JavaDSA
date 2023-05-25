package strings;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		XmWood(arr, n, x);
	}

	public static void XmWood(int[] arr, int n, int x) {
		int min = arr[0];
		for (int i = 1; i < n; i++) {
			min = Math.min(min, arr[i]);
		}
		int rem = 0;
		while (rem != x) {
			rem = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j] > min) {
					rem += arr[j] - min;
				}
			}
			if (rem == x) {
				System.out.println(min);
				return;
			} else {
				min++;
			}
		}
	}
}
