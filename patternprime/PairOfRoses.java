package patternprime;

import java.util.Scanner;

public class PairOfRoses {

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
			int amt = sc.nextInt();
			PairOfRoses(arr, n, amt);
		}

	}

	public static void PairOfRoses(int[] arr, int n, int amt) {
		int mindiff = Integer.MAX_VALUE;
		int p = 0;
		int q = 0;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				if (arr[i] + arr[j] == amt) {
					if (mindiff > Math.abs(arr[i] - arr[j])) {
						mindiff = Math.abs(arr[i] - arr[j]);
						p = arr[i];
						q = arr[j];
					}
				}
			}
		}
		System.out.print("Deepak should buy roses whose prices are " + Math.min(p, q) + " and " + Math.max(p, q) + ".");
	}
}