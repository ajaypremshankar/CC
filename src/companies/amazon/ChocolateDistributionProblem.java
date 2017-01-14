package companies.amazon;

import java.util.Arrays;
import java.util.Scanner;

/*
 Given an array A[] of N integers where each value represents number of chocolates in a packet. Each packet can have variable number of chocolates. There are m students, the task is to distribute chocolate packets such that :
 1. Each student gets one packet.
 2. The difference between the number of chocolates given to the students in packet with maximum chocolates and packet with minimum chocolates is minimum.



 Examples

 Input : A[] = {3, 4, 1, 9, 56, 7, 9, 12} 
 m = 5
 Output: Minimum Difference is 6
 We may pick 3,4,7,9,9 and the output 
 is 9-3 = 6


 Input : A[] = {7, 3, 2, 4, 9, 12, 56} 
 m = 3
 Output: Minimum difference is 2
 We can pick 2, 3 and 4 and get the minimum
 difference between maximum and minimum packet
 sizes. ie 4-2 = 2


 Input:
 The first line of input contains an integer T, denoting the no of test cases. Then T test cases follow. Each test case consists of three lines. The first line of each test case contains an integer N denoting the no of packets. Then in the next line are N space separated values of the array A[] denoting the values of each packet. The third line of each test case contains an integer m denoting the no of students.

 Output:
 For each test case in a new line print the required answer .

 Constraints:
 1 <=T<= 100
 1 <=N<= 100
 1 <=A[]<= 100
 1 <=m <=N

 Example:
 Input:
 2
 8
 3 4 1 9 56 7 9 12
 5
 7
 7 3 2 4 9 12 56
 3
 Output:
 6
 2
 */

public class ChocolateDistributionProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		while (num-- > 0) {
			int len = sc.nextInt();
			int arr[] = new int[len];
			for (int i = 0; i < len; i++) {
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);

			int students = sc.nextInt();
			System.out.println(arr[students - 1] - arr[0]);

		}
		sc.close();
	}

}
