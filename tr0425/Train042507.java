//양의 정숫값 뒤에서부터 읽기
package tr0425;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Train042507 {
	
	static Scanner sc = new Scanner(System.in);
	
	static int readPlusInt() {
		int x;
		do {
			System.out.println("양의 정숫값 : ");
			x = sc.nextInt();
		}while(x <=0);
		return x;
	}

	public static void main(String[] args) {
		int x;
		do {
			int n = readPlusInt();
			
			System.out.print("반대로 읽으면 ");
			while(n>0) {
				System.out.print(n%10); // n의 마지막 자릿수를 표시
				n/=10; //n을 10으로 나눔
			}
			System.out.println("입니다.");
			
			do {
				System.out.println("다시한번?<yes...1/No...0> : ");
				x = sc.nextInt();
			}while(x!=0 && x!=1);
		}while(x==1);

	}

}
