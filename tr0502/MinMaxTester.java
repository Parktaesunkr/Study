package tr0502;

import java.util.Scanner;

public class MinMaxTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 : "); int x = sc.nextInt();
		System.out.print("y값 : "); int y = sc.nextInt();
		System.out.print("z값 : "); int z = sc.nextInt();
		System.out.print("배열 a의 요소 수 : ");
		int num = sc.nextInt();
		int[]a = new int[num];
		for(int i =0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.printf("x,y의 최솟값은 %d입니다.\n", MinMax.min(x, y));
		System.out.printf("x,y의 최댓값은 %d입니다.\n", MinMax.max(x, y));
		System.out.printf("x,y,z의 최솟값은 %d입니다.\n", MinMax.min(x, y, z));
		System.out.printf("x,y,z의 최솟값은 %d입니다.\n", MinMax.max(x, y, z));
		System.out.printf("배열 a의 최솟값은 %d입니다.\n", MinMax.min(a));
		
		int xmin[] = MinMax.minIndexArray(a);
		System.out.print("인덱스는 {");
		for(int i = 0; i < xmin.length; i++)
			System.out.print(xmin[i]+" "); System.out.println("} 입니다.");
		
		System.out.printf("배열 a의 최댓값은 %d입니다.\n", MinMax.max(a));
		int xmax[] = MinMax.maxIndexArray(a);
		System.out.print("인덱스는 {");
		for(int i = 0; i < xmax.length; i++)
			System.out.print(xmax[i]+" "); System.out.println("} 입니다.");
		
		
	}

}
