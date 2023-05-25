package strings;

import java.util.Scanner;

public class KartikandStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String str = sc.next();
		int a = KartikStrings(str, k, 'b');
		int b = KartikStrings(str, k, 'a');
		System.out.println(Math.max(a, b));
	}

	public static int KartikStrings(String str, int k, char ch) {
		int si = 0;
		int ei = 0;
		int flip = 0;
		int ans = 0;
		while (ei < str.length()) {
			if (str.charAt(ei) == ch) {
				flip++;
			}
			while (flip > k && si <= ei) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;
	}

}
