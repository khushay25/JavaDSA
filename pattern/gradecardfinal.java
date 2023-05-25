package pattern;
import java.util.Scanner;

public class gradecardfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();

		if (marks >= 75) {
			System.out.println("GRADE A");
		} else if (marks >= 65 && marks < 75) {
			System.out.println("GRADE B");
		} else if (marks >= 55 && marks < 65) {
			System.out.println("GRADE C");
		} else if (marks >= 45 && marks < 55) {
			System.out.println("GRADE D");
		} else {
			System.out.println("FAIL!");
		}
	}

}
