package patternprime;

import java.util.Scanner;

public class NextPermutationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			NextPermutation(arr, n);
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static void NextPermutation(int[] arr, int len) {
		// TODO Auto-generated method stub
		int p = 0;
		for (int i = len - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		int q = 0;
		for (int i = len - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		if (p == 0 && q == 0) {
			reverse(arr, 0, len - 1);
			return;
		}
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;

		reverse(arr, p + 1, len - 1);
	}

	public static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
