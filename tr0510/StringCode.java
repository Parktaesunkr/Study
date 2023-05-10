// 문자열을 한 글자씩 확인해서 문자 코드로 표시
package tr0510;

import java.util.Scanner;

public class StringCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열s : ");
		String s = sc.next();
		
		for(int i = 0; i < s.length(); i++)
			System.out.printf("s[%d] = %c %4X \n", i , s.charAt(i),(int)s.charAt(i));
	}

}
