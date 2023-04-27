// 정수형의 내부 비트를 표시하는 메서드
package tr0427;

import java.util.Scanner;

public class Train042709 {
	
	static void printBits(byte x) {
		for(int i = 7; i>=0; i--)
			System.out.print((x>>>i & 1)==1 ? '1' : '0');
	}
	static void printBits(short x) {
		for(int i = 15; i>=0; i--)
			System.out.print((x>>>i & 1)==1 ? '1' : '0');
	}
	static void printBits(int x) {
		for(int i = 31; i>=0; i--)
			System.out.print((x>>>i & 1)==1 ? '1' : '0');
	}
	static void printBits(long x) {
		for(int i = 63; i>=0; i--)
			System.out.print((x>>>i & 1)==1 ? '1' : '0');
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("byte    형 정수 a의 값 : "); byte a = sc.nextByte();
		System.out.print("short   형 정수 b의 값 : "); short b = sc.nextShort();
		System.out.print("int     형 실수 c의 값 : "); int c = sc.nextInt();
		System.out.print("long    형 실수 d의 값 : "); long d= sc.nextLong();
		System.out.println("a의 비트 : "); printBits(a);
		System.out.println("\nb의 비트 : "); printBits(b);
		System.out.println("\nc의 비트 : "); printBits(c);
		System.out.println("\nd의 비트 : "); printBits(d);
		System.out.println();
		
	}

}
