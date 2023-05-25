package patternprime;

import java.util.Scanner;

public class RainWaterTrapping {

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
			System.out.println(RainWaterTrapping(n, arr));
		}
	}

	public static int RainWaterTrapping(int n, int[] arr) {
		int ans = 0;
		int[] leftmax = new int[n];
		int[] rightmax = new int[n];
		for (int i = 1; i < n; i++) {
			leftmax[0] = arr[0];
			leftmax[i] = Math.max(leftmax[i - 1], arr[i]);
		}
		for (int i = n - 2; i >= 0; i--) {
			rightmax[n - 1] = arr[n - 1];
			rightmax[i] = Math.max(rightmax[i + 1], arr[i]);
		}
		for (int i = 0; i < n; i++) {
			ans += Math.min(rightmax[i], leftmax[i]) - arr[i];
		}
		return ans;
	}

}
