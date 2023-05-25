package patternprime;

import java.util.Scanner;

public class SortLinearTimeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int zerocount = 0;
		int onecount = 0;
		int twocount = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				zerocount++;
			} else if (arr[i] == 1) {
				onecount++;
			} else {
				twocount++;
			}
		}
		for (int i = 0; i < zerocount; i++) {
			arr[i] = 0;
		}
		for (int i = zerocount; i < zerocount + onecount; i++) {
			arr[i] = 1;
		}
		for (int i = zerocount + onecount; i < n; i++) {
			arr[i] = 2;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
