package patternprime;

import java.util.Scanner;

public class SpiralPrintACW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		SpiralPrint(arr, n, m);
	}

	public static void SpiralPrint(int arr[][], int n, int m) {
		int count = 0;
		int noe = m * n;
		int mr = 0;
		int mc = 0;
		int xr = n - 1;
		int xc = m - 1;
		while (noe > count) {
			for (int i = mr; i <= xr && noe > count; i++) {
				System.out.print(arr[i][mc] + ", ");
				count++;
			}
			mc++;
			for (int i = mc; i <= xc && noe > count; i++) {
				System.out.print(arr[xr][i] + ", ");
				count++;
			}
			xr--;
			for (int i = xr; i >= mr && noe > count; i--) {
				System.out.print(arr[i][xc] + ", ");
				count++;
			}
			xc--;
			for (int i = xc; i >= mc && noe > count; i--) {
				System.out.print(arr[mr][i] + ", ");
				count++;
			}
			mr++;
		}
		System.out.print("END");
	}

}
