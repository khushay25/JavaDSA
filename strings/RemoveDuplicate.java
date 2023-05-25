package strings;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		RemoveDuplicates(str);
	}

	public static void RemoveDuplicates(String str) {
		String ans = "";
		char prev = str.charAt(0);
		int i = 1;
		while (i < str.length()) {
			char curr = str.charAt(i);
			if (prev == curr) {
				i++;
			} else {
				ans = ans + str.charAt(i);
				prev = curr;
			}
		}
		System.out.println(str.charAt(0) + ans);
	}

}
