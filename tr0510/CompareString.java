// 문자열 비교
package tr0510;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 s1 : "); String s1 = sc.next();
		System.out.print("문자열 s2 : "); String s2 = sc.next();
		
		if(s1==s2)
			System.out.println("s1 == s2 입니다.");
		else
			System.out.println("s1 != s2 입니다.");
		
		if(s1.equals(s2))
			System.out.println("s1 == s2 입니다.");
		else
			System.out.println("s1 != s2 입니다.");

	}

}
