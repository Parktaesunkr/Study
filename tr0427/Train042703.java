// 배열에서 연속되는 n개의 요소를 삭제한 배열
package tr0427;

import java.util.Scanner;

public class Train042703 {
	static int[] arrayRmvOfN(int[]a, int idx, int n) {
		if(n<0 || idx<0|| idx> a.length)
			return a.clone();
		else {
			if(idx + n > a.length)
				n= a.length - idx;
			int[] c = new int[a.length - n];
			int i = 0;
			for(; i < idx; i++)
				c[i] = a[i];
			for(; i < a.length-n; i++)
				c[i] = a[i+n];
			return c;
			}
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 :");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i+ "] :");
			x[i] = sc.nextInt();
		}
		System.out.print("삭제를 시작할 인덱스 : ");
		int idx = sc.nextInt();
		
		System.out.print("삭제할 요소의 개수 : ");
		int n =sc.nextInt();
		
		int[]y = arrayRmvOfN(x, idx, n);
		
		for(int i =0; i < y.length; i++)
			System.out.println("y[" + i +"] = " + y[i]);

	}

}
