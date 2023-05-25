package patternprime;

import java.util.Scanner;

public class SquareOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		SquaredArray(arr, n);
		SortedArray(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] SquaredArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			int temp = arr[i];
			int square = temp * temp;
			arr[i] = square;
		}
		return arr;
	}

	public static int[] SortedArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
