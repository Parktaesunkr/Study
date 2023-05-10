// 문자열 비교 대소관계
package tr0510;

import java.util.Scanner;

public class StringCompareTo {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 s1 : "); String s1 = sc.next();
		System.out.print("문자열 s2 : "); String s2 = sc.next();
		
		int balance = s1.compareTo(s2);
		if(balance < 0)
			System.out.println("s1이 작다.");
		else if(balance > 0)
			System.out.println("s2가 작다.");
		else
			System.out.println("s1과 s2가 같다.");

	}

}
