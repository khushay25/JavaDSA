package patternprime;

import java.util.Scanner;

public class SpiralPrintCWArray {

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

	public static void SpiralPrint(int[][] arr, int n, int m) {
		int mr = 0;
		int mc = 0;
		int xr = n - 1;
		int xc = m - 1;
		int noe = m * n;
		int count = 0;
		while (count < noe) {
			for (int j = mc; j <= xc && count < noe; j++) {
				System.out.print(arr[mr][j] + ", ");
				count++;
			}
			mr++;
			for (int i = mr; i <= xr && count < noe; i++) {
				System.out.print(arr[i][xc] + ", ");
				count++;
			}
			xc--;
			for (int j = xc; j >= mc && count < noe; j--) {
				System.out.print(arr[xr][j] + ", ");
				count++;
			}
			xr--;
			for (int i = xr; i >= mr && count < noe; i--) {
				System.out.print(arr[i][mc] + ", ");
				count++;
			}
			mc++;
		}
		System.out.println("END");
	}
}
