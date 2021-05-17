import java.util.Scanner;

/*
 * 
 * input: Shreevatsa is good boy
 * output: ahreevatsS is doog boy
 * 
 * 
 * split first
 * take 1st string word
 * traverse trrough the word
 * 
 * 
 * 
 */

public class SwapString {

	public static void main(String[] args) {

		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);

		String s = "Manju";

		System.out.println(s.length());

		char first = s.charAt(0);
		char last = s.charAt(s.length() - 1);
		System.out.println("First:" + first);
		System.out.println("Last:" + last);

		String String2 = "";

		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				String2 += last;
			} else if (i == s.length() - 1) {
				String2 += first;
			} else {
				String2 += s.charAt(i);
			}
		}

		System.out.println(String2);
	}

}
