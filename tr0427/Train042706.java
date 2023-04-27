// 2차원 배열의 복사본 생성
package tr0427;

import java.util.Scanner;

public class Train042706 {

	static int[][] aryClone2(int[][]a){
		int[][] c = new int[a.length][];
		for(int i = 0; i < a.length; i++) {
			c[i] = new int[a[i].length]; 
			for(int j = 0; j < a[i].length; j++)
				c[i][j] = a[i][j];
		}
		return c;
	}
	static void printMatrix(int[][]m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행열의 행 수 :" ); int height = sc.nextInt();
		System.out.print("행열의 열 수 :" ); int width = sc.nextInt();
		
		
		int[][]a = new int[height][width];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("a[%d][%d]:",i,j);
				a[i][j] = sc.nextInt();}
			}
			int[][] ca =aryClone2(a);
			System.out.println("행렬a");
			printMatrix(a);
			
			System.out.println("행렬a의 복사본");
			printMatrix(ca);

	}

}
