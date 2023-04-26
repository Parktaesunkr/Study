package tr0426;

import java.util.Scanner;

public class Train042611 {
	// 배열 a의 복사본을 생성해서 반환
	static int[] arrayClone(int[]a) {
		int[]c =new int[a.length];
		for(int i =0; i < c.length; i++)
			c[i] = a[i];
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 :");
		int num =sc.nextInt();
		
		int[]x = new int[num]; // num 크기의 배열 생성
		
		for(int i =0; i < num; i++) {
			System.out.print("a[" +i+"] :");
			x[i] = sc.nextInt();
		}
		
		int[] y = arrayClone(x); // 베열 x 복사
		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
		for(int i =0; i < num; i++) // 배열 y 표시
			System.out.println("y[" + i+ "] =" + y[i]);

	}

}
