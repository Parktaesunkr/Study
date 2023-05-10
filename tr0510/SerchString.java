// 문자열 탐색
package tr0510;

import java.util.Scanner;

public class SerchString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("문자열 s1 : "); String s1 = sc.next();
	System.out.print("문자열 s2 : "); String s2 = sc.next();

	int idx = s1.indexOf(s2);
	if(idx == -1)
		System.out.println("s1 안에 s2가 포함돼 있지 않습니다.");
	else {
		System.out.println(s1);
		for(int i =0; i < idx; i++)
			System.out.print(' ');
			System.out.println(s2);
	}	
	}
}
