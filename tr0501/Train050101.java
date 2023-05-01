// 사람 클래스의 인스턴스 배열
package tr0501;

import java.util.Scanner;

import tr0428.Human;

public class Train050101 {
	
	static void printHumanArray(Human2[]a) {
		for(int i = 0; i < a.length; i++)
			System.out.printf("No.%d %s %3dcm %3dkg\n", i , a[i].getName(),
					a[i].getHeight(), a[i].getWeight());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Human2[] p = {
				new Human2("철수",170,70),
				new Human2("길동", 160, 59),
		};

		System.out.print("배열 q의 요소 수 : ");
		n = sc.nextInt();
		
		Human2[] q = new Human2[n];
		for(int i = 0; i < q.length; i++) {
			System.out.print("이름 : "); String name = sc.next();
			System.out.print("신장 : "); int height = sc.nextInt();
			System.out.print("체중 : "); int weight = sc.nextInt();
		}
		Human2[][] x = {
				{new Human2("김철수",175,52),new Human2("김영희",169,60)},
				{new Human2("홍길동",178,70),new Human2("이철수",171,61)},
				{new Human2("이영희",168,59),new Human2("김길동",165,59)},
			};
		System.out.print("배열 y의 행 수 : ");
		n = sc.nextInt();
		
		
		Human2[][] y = new Human2[n][];
		for(int i = 0; i < y.length; i++) {
			System.out.print("y[" + i + "]의 열 수 :");
			n = sc.nextInt();
			y[i] = new Human2[n];
			for(int j= 0; j < y[i].length; j++) {
				System.out.println("y["+i+"]["+j+"]");
				System.out.print("이름 : "); String name = sc.next();
				System.out.print("신장 : "); int height = sc.nextInt();
				System.out.print("체중 : "); int weight = sc.nextInt();
				y[i][j] = new Human2(name, height, weight);
			}
		}
		
		System.out.println("배열 p");
		printHumanArray(p);
		System.out.println("배열 q");
		printHumanArray(q);
		
		System.out.println("배열 x");
		for(int i = 0; i < x.length; i++) {
			System.out.printf("%d행\n",i);
			printHumanArray(x[i]);
		}
		System.out.println("배열 y");
		for(int i = 0; i < y.length; i++) {
			System.out.printf("%d행\n",i);
			printHumanArray(y[i]);
		}
	}

}
