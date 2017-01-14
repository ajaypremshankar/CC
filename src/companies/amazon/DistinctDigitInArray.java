package companies.amazon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 Given an array A[] of n elements.The task is to make a sorted array which will contain all distinct digits present in A[].


 Input:
 The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains an integer N, denoting the length of the array. Then in the next line are N space separated integers of the array. 

 Output:
 For each test case in a new line print the distinct array of digits.

 Constraints:
 1<=T<=100
 1<=n<=200
 1<=A[]<=1000


 Example:
 Input:
 2
 3
 131 11 48
 4
 111 222 333 446

 Output:
 1 3 4 8
 1 2 3 4 6
 */

public class DistinctDigitInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num-- > 0){
			
			int s = sc.nextInt();
			
			String line = sc.nextLine();
			line = "".equals(line)? sc.nextLine(): line;
			
			TreeSet<Character> set = new TreeSet<>();
			
			for(Character ch: line.toCharArray()){
				if(!Character.isSpaceChar(ch)){
					set.add(ch);
				}
			}
			
			System.out.println(getSpaceSeparatedChars(set));
			
		}
	}

	private static String getSpaceSeparatedChars(TreeSet<Character> set) {

		StringBuffer sbr = new StringBuffer();
		for(Iterator<Character> it = set.iterator(); it.hasNext(); ){
			sbr.append(it.next()).append(" ");
		}
		return sbr.toString().trim();
	}
}
