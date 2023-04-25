// 1부터 n까지의 합 구하기
package tr0425;

import java.util.Scanner;

public class Train042501 {
	
	class SumUp{
		//1부터 n까지의 합
		static int sumUp(int n) {
			int sum = 0;
			for(int i = 0; i<=n; i++)
				sum+= i;
			return sum;
		}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 x까지의 합을 구하자.");
		int x;
		do {
			System.out.println("x의 값 :");
			x = sc.nextInt();
		}while (x<=0);
		
		System.out.println("1부터" + x + "까지의 합은" + sumUp(x) + "입니다.");

	}

}
}
