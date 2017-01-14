package companies.amazon;

import java.util.Scanner;

/*Given a String S. Your task is to remove the given two strings(M and N) completely from the given string S. If String is completely removed than print -1.
 Input:
 The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Th first line of input contains a String S. And next line contains two Strings which is to be removed M and N.

 Output:
 Print the respective output in the respective line.

 Constraints:
 1<=T<=20
 1<=|Length of Strings|<=50

 Example:
 Input:
 2
 abbbccab
 ab bcc
 narendramodi
 add di

 Output:
 b
 narendramo
 */
public class Demonitisation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		while (num-- > 0) {
			String targetStr = sc.next().trim();

			String pattern1 = sc.next().trim();
			String pattern2 = sc.next().trim();
			targetStr = targetStr.replaceAll(pattern1, "")
					.replaceAll(pattern2,"");
			System.out.println(targetStr);
		}

		sc.close();
	}

}
