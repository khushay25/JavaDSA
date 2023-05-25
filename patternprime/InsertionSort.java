package patternprime;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		InsertionSort(arr, n);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] InsertionSort(int[] arr, int n) {
		// TODO Auto-generated method stub
		for (int i = 1; i < n; i++) {
			int item = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			j++;
			arr[j] = item;
		}
		return arr;
	}

}
