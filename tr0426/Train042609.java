// 배열에 요소 삽입하기
package tr0426;

import java.util.Scanner;

public class Train042609 {
	// 배열 a의 a[idx]에 x를 삽입(뒤에 있는 요소를 하나씩 오른쪽을 이동시킴)
	static void aryIns(int[]a, int idx, int x) {
		if(idx >= 00 && idx < a.length) {
			for(int i = a.length -1; i > idx ; i--)
				a[i] = a[i-1];
			a[idx]= x;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		int[]a = new int[num]; // num크기의 배열 생성
		
		for(int i =0; i < num; i++) {
			System.out.print("a[" + i+ "] :");
			a[i] = sc.nextInt();
		}
		System.out.print("삽입할 요소의 인덱스 : ");
		int idx =sc.nextInt();
		
		System.out.print("삽입할 값 : ");
		int n = sc.nextInt();
		
		aryIns(a, idx, n); // 배열 a에서 a[idx]에 x를 삽입
		
		for(int i =0; i < num; i++) // 배열 a 표시
			System.out.println("a[" + i + "]= " +a[i]);
	}

}
