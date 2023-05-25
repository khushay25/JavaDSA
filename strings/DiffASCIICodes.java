package strings;

import java.util.Scanner;

public class DiffASCIICodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		AsciiCodeDiff(str);
	}

	public static void AsciiCodeDiff(String str) {
		char prev = str.charAt(0);
		String ans = "";
		for (int i = 1; i < str.length(); i++) {
			char curr = str.charAt(i);
			ans = ans + prev + (curr - prev);
			prev = curr;
		}
		ans = ans + prev;
		System.out.println(ans);
	}

}
