package patternprime;

import java.util.Scanner;

public class AlexGoesShpping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] items = new int[n];
		for (int i = 0; i < n; i++) {
			items[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		while (q-- > 0) {
			int A = sc.nextInt();
			int K = sc.nextInt();
			if (ispossible(items, n, A, K) == true) {
				System.out.println("Yes");
				;
			} else {
				System.out.println("No");
			}
		}
	}

	public static boolean ispossible(int[] items, int n, int a, int k) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a % items[i] == 0) {
				count++;
			}
		}
		if (count >= k) {
			return true;
		} else {
			return false;
		}
	}

}
