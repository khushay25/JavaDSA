package strings;

import java.util.Scanner;

public class CanYouReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		IsReadable(str);
	}

	public static void IsReadable(String str) {
		// TODO Auto-generated method stub
		String ans = "";
		ans = ans + str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				System.out.println(ans);
				ans = "";
				ans = ans + ch;
			} else {
				ans = ans + ch;
			}
		}
		System.out.println(ans);
	}

}
