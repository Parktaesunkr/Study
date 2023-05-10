// 문자열 배열을 표시하는 메서드
package tr0510;

import java.util.Scanner;

public class PrintStringArray {
	
	static void printStringArray(String[] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length(); j++)
				System.out.print(a[i].charAt(j));
			System.out.println();
		}
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("문자열의 개수 : ");
	int n = sc.nextInt();
	String[]sx = new String[n];
	for(int i = 0; i < sx.length; i++) {
		System.out.print("sx["+i+"] =");
		sx[i] = sc.next();
	}
	printStringArray(sx);
	}

}
