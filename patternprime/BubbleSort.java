package patternprime;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		BubbleSort(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] BubbleSort(int[] arr, int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
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
