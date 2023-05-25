package patternprime;

import java.util.Scanner;

public class InverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int brr[] = new int[n];
		for (int i = 0; i < n; i++) {
			brr[i] = arr[i];
		}
		InverseOfArray(arr, n, brr);

		for (int i = 0; i < n; i++) {
			System.out.print(brr[i] + " ");
		}
	}

	public static int[] InverseOfArray(int[] arr, int n, int[] brr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			int temp = arr[i];
			brr[temp] = i;
		}
		return brr;
	}

}
