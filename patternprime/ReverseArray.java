package patternprime;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		ReverseArr(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] ReverseArr(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++, n--) {
			int temp = arr[i];
			arr[i] = arr[n - 1];
			arr[n - 1] = temp;
		}
		return arr;
	}

}
