package patternprime;

import java.util.Scanner;

public class TransposeSquareMatrix {

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
		Transpose(arr, n);

		for (int k = 0; k < n; k++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[k][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] Transpose(int[][] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		return arr;
	}
}