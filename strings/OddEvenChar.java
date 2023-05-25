package strings;

import java.util.Scanner;

public class OddEvenChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		OddEven(str);
	}

	public static void OddEven(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((i) % 2 == 0) {
				ch = (char) (ch + 1);
				ans = ans + ch;

			} else {
				ch = (char) (ch - 1);
				ans = ans + ch;
			}
		}
		System.out.println(ans);
	}

}
