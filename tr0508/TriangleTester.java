package tr0508;

import java.util.Scanner;

public class TriangleTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삼각형의 개수 : ");
		int no = sc.nextInt();
		AbstTriangle[]p = new AbstTriangle[no];
		
		for(int i = 0; i < no; i++) {
			int type;
			do {
				System.out.print((i+1)+"번의 삼각형 종류 (1..좌하 직각/2..좌상 직각" +
			"/3..우하 직각/4..우상 직각) :");
				type = sc.nextInt();
			}while(type < 1|| type > 4);
			
			System.out.print("길이 : ");
			int len = sc.nextInt();
			p[i] = (type == 1) ? new TriangleLB(len) : (type == 2) ? new TriangleLU(len) : 
				(type == 3) ? new TriangleRB(len) :new TriangleRU(len);
		}
		for(AbstTriangle s : p) {
			s.print();
			System.out.println();
		}

	}

}
