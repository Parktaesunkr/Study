// 배열에서 연속된 요소를 삭제
package tr0426;

import java.util.Scanner;

public class Train042608 {
	// 배열 a에서 a[idx]부터 n개의 요소를 삭제
	static void aryRmvN(int[]a, int idx,int n) {
		if(n > 0 && idx >= 0 && idx +n < a.length ) {
			int idx2 = idx + n - 1;
			if(idx2 > a.length - n - 1)
				idx2 = a.length -n -1;
			for(int i = idx; i <= idx2; i++)
				a[i] =a[i+n];
			}
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		int[]a = new int[num];
		
		for(int i =0; i < num; i++) {
			System.out.print("a["+ i+ "] :");
			a[i] = sc.nextInt();
		}
		System.out.print("삭제를 시작할 인덱스 : ");
		int idx = sc.nextInt();
		
		System.out.print("삭제할 요소의 수 : ");
		int n = sc.nextInt();
		aryRmvN(a, idx, n); // 배열 a에서 a[idx]부터 n개의 요소를 삭제
		for(int i =0; i < num; i++) // 배열 a 표시
			System.out.println("a[" + i+ "] = " + a[i]);

	}

}