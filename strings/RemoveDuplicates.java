package strings;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		String s1;
		String s2;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				s1 = s.substring(i, j);
				s2 = s.substring(i + 1, j + 1);
				if(s1==s2) {
					
				}
			}
		}

	}
}