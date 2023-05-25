package patternprime;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 1;
		for (int i = 4; i > 0; i--) {
			while (j <= i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			j = 1;
		}
	}

}
