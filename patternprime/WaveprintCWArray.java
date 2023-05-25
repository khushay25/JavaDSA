package patternprime;

import java.util.Scanner;

public class WaveprintCWArray {

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
		WavePrintCW(arr, n, m);
	}

	public static void WavePrintCW(int[][] arr, int n, int m) {
		int xr = n - 1;
		int xc = m - 1;
		int mr = 0;
		int mc = 0;
		int noe = n * m;
		int count = 0;
		while (count < noe) {
			for (int i = mr; i <= xr && count < noe; i++) {
				System.out.print(arr[i][mc] + ", ");
				count++;
			}
			mc++;
			for (int i = xr; i >= 0 && count < noe; i--) {
				System.out.print(arr[i][mc] + ", ");
				count++;
			}
			mc++;
		}
		System.out.print("END");
	}
}
