//정수를 좌우로 회전한 비트를 표시
package tr0425;

import java.util.Scanner;

public class Train042510 {

	static void printBits(int x) {
		for(int i =31; i >=0; i--)
			System.out.print(((x>>>i&1)==1) ? '1' : '0');
	}
	
	static int rRotate(int x, int n) {
		if(n<0)return lRotate(x,-n);
		n %= 32;
		return(n == 0 ? x : (x >>> n) | (x << (32-n)));
	}
	static int lRotate(int x, int n) {
		if(n<0)return rRotate(x,-n);
		n %= 32;
		return(n == 0 ? x : (x << n) | (x >>> (32-n)));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수x를 n비트 회전합니다.");
		System.out.print("x :"); int x = sc.nextInt();
		System.out.print("n :"); int n = sc.nextInt();
		System.out.print("회전 전 ="); printBits(x);

		
		System.out.print("\n오른쪽회전 ="); printBits(rRotate(x, n));
		System.out.print("\n왼쪽회전 ="); printBits(lRotate(x, n));
		System.out.println();
	}

}
