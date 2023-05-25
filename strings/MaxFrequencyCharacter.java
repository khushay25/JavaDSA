package strings;

import java.util.Scanner;

public class MaxFrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.print(MaxFreq(str));
	}

	public static char MaxFreq(String str) {
		int[] frq = new int[26];
		int max = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			frq[ch - 97] = frq[ch - 97] + 1;
		}
		for (int i = 0; i < frq.length; i++) {
			if (frq[max] < frq[i]) {
				max = i;
			}
		}
		char ch = (char) (97 + max);
		return ch;
	}

}
