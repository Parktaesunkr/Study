package tr0510;

import java.util.Scanner;

public class ScanStringRev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String s = sc.next();
		
		System.out.print("반대로 읽으면 ");
		for(int i = s.length() -1; i >=0; i--)
			System.out.print(s.charAt(i));
		System.out.println("입니다.");

	}

}
