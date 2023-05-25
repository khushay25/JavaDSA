package patternprime;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int r = sc.nextInt();
		r = r % n;

		RotateArr(arr, 0, n - r);
		RotateArr(arr, n - r, n);
		RotateArr(arr, 0, n);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] RotateArr(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j - 1];
			arr[j - 1] = temp;
			i++;
			j--;
		}
		return arr;
	}
}
