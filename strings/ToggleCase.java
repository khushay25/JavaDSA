package strings;

import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Toggle(str);
	}

	public static void Toggle(String str) {
		// TODO Auto-generated method stub
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 97 && ch <= 122) {
				ch = (char) (ch - 32);
				ans = ans + ch;
			} else {
				ch = (char) (ch + 32);
				ans = ans + ch;
			}
		}
		System.out.println(ans);
	}

}
