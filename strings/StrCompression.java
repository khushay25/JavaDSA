package strings;

import java.util.Scanner;

public class StrCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Compression(str);
	}

	public static void Compression(String str) {
		int count = 1;
		String ans = "";
		char prev = str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			if (prev == curr) {
				count++;
			} else {
				ans = ans + prev + count;
				prev = curr;
				count = 1;
			}
		}
		ans = ans + str.charAt(str.length() - 1) + count;
		System.out.println(ans);
	}

}
