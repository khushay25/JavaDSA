package patternprime;

import java.util.Scanner;

public class PiyushandMagicalPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int minstr = sc.nextInt();
		int maxstr = sc.nextInt();
		char arr[][] = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		MagicalPark(arr, n, m, minstr, maxstr);
	}

	public static void MagicalPark(char[][] arr, int n, int m, int minstr, int maxstr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (maxstr < minstr) {
					break;
				}
				if (arr[i][j] == '.') {
					maxstr -= 2;
				} else if (arr[i][j] == '*') {
					maxstr += 5;
				} else {
					break;
				}
				if (j < m - 1) {
					maxstr--;
				}
			}
		}
		if (maxstr >= minstr) {
			System.out.println("Yes");
			System.out.println(maxstr);
		} else {
			System.out.println("No");
		}
	}

}
