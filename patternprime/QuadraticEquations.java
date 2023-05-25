package patternprime;

import java.util.Scanner;

public class QuadraticEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int D = b * b - 4 * a * c;
		if (D > 0) {
			int root1 = (int) ((-b - (Math.sqrt(D))) / (2 * a));
			int root2 = (int) ((-b + (Math.sqrt(D))) / (2 * a));
			System.out.println("Real and Distinct");
			System.out.println(root1 + " " + root2);
		} else if (D == 0) {
			int root = (-b / (2 * a));
			System.out.println("Real and Equal");
			System.out.println(root + " " + root);
		} else {
			System.out.println("Imaginary");
		}
	}

}
