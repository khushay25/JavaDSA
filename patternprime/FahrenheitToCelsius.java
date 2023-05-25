package patternprime;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int step = sc.nextInt();

		for (int i = min; i <= max; i += step) {
			int F = i;
			int C = (F - 32) * 5 / 9;
			System.out.println(i + "\t" + C);
		}
	}

}
