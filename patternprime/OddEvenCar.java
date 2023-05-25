package patternprime;

import java.util.Scanner;

public class OddEvenCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			int EvenSum = 0;
			int OddSum = 0;
			int n = sc.nextInt();
			while (n > 0) {
				int rem = n % 10;
				if (rem % 2 == 0) {
					EvenSum = EvenSum + rem;
				} else {
					OddSum = OddSum + rem;
				}
				n = n / 10;
			}
			if (EvenSum % 4 == 0 || OddSum % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			t--;
		}
	}

}
