package patternprime;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		SelectionSort(n, arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void SelectionSort(int n, int[] arr) {
		for (int i = 0; i < n; i++) {
			int mini = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[mini]) {
					mini = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}
	}

}
