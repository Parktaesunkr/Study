// 은행 계좌 및 기본 정보
package tr0503;

import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("계좌 개설 수 : ");
		int n = sc.nextInt();
		Account[] a= new Account[n];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("[0]...간이 [1]...상세 : ");
			int type = sc.nextInt();
			
			System.out.println("계좌 정보를 입력하세여.");
			System.out.print("명  의 : "); String name = sc.next();
			System.out.print("번  호 :"); String no = sc.next();
			
			if(type == 0)
				a[i] = new Account(name,no);
			else {
				System.out.print("잔  고 :"); int balance = sc.nextInt();
				System.out.print("개설 연도 :"); int y = sc.nextInt();
				System.out.print("개설 월 :"); int m = sc.nextInt();
				System.out.print("개설 일 :"); int d = sc.nextInt();
				a[i] = new Account(name, no, balance, new Day(y, m, d));
			}
			
			System.out.println("계좌 기본 정보 : " + a[i]);
			System.out.println("식별 번호 : " + a[i].getId());
			System.out.println("개설 일 : " + a[i].getOpenDay().toString());
		}
	}

}
