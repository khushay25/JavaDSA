package patternprime;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test-- > 0) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] rick = new int[n];
			for (int i = 0; i < n; i++) {
				rick[i] = sc.nextInt();
			}
			int[] cab = new int[m];
			for (int i = 0; i < m; i++) {
				cab[i] = sc.nextInt();
			}
			System.out.println(MinCost(c1, c2, c3, c4, n, m, cab, rick));
		}
	}

	public static int MinCost(int c1, int c2, int c3, int c4, int n, int m, int[] cab, int[] rick) {
		// TODO Auto-generated method stub
		int rickmin = 0;
		for (int i = 0; i < n; i++) {
			rickmin += Math.min(rick[i] * c1, c2);
		}
		rickmin = Math.min(rickmin, c3);

		int cabmin = 0;
		for (int i = 0; i < m; i++) {
			cabmin += Math.min(cab[i] * c1, c2);
		}
		cabmin = Math.min(cabmin, c3);

		int mincost = 0;
		mincost = Math.min(cabmin + rickmin, c4);

		return mincost;
	}

}
