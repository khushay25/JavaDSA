package patternprime;

import java.util.Scanner;

public class RotateArray90deg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Rotate90deg(arr, n);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] Rotate90deg(int[][] arr, int n) {
		for (int i = 0; i < n; i++) {
			ReverseRow(i, n, arr);
		}
		// transpose
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		return arr;
	}

	public static int[][] ReverseRow(int i, int n, int arr[][]) {
		for (int j = 0; j < n / 2; j++) {
			int temp = arr[i][j];
			arr[i][j] = arr[i][n - j - 1];
			arr[i][n - j - 1] = temp;
		}
		return arr;
	}
}
