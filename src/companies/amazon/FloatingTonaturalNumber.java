package companies.amazon;

import java.util.Scanner;
import java.util.TreeSet;

/*
 Given a positive floating point number n, the task is to find the smallest integer k, such that when we multiply k with n, we get a natural number.

 Examples:
 Input : 30.25
 Output : 4
 30.25 * 4 = 321, there is no number less than 4 which can convert 30.25 into natural number.

 Input : 5.5
 Output : 2
 5.5 * 2 = 11, there is no number less than 2 which can convert 5.5 into natural number. 


 Input:
 The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contain a decimal number N.

 Output:
 For each test case in a new line print the required result.

 Constraints:
 1<=T<=100
 1<=N<=1000

 Example:
 Input:
 2
 30.25
 5.5
 Output:
 4
 2
 */

public class FloatingTonaturalNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		while (num > 0) {
			float doub = sc.nextFloat();

			for (int i = 1; i < 1000; i++) {
				if (Math.floor(doub * i) == Math.ceil(doub * i)) {
					System.out.println(i);
					break;
				}
			}
			num--;
		}
		sc.close();
	}
}
