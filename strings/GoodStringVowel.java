package strings;

import java.util.Scanner;

public class GoodStringVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(GoodString(s));
	}

	public static boolean IsVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

	public static int GoodString(String s) {
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (IsVowel(ch) == true) {
				int count = 0;
				while (i < s.length() && IsVowel(s.charAt(i)) == true) {
					count++;
					i++;
				}
				ans = Math.max(ans, count);
			}
		}
		return ans;
	}

}
