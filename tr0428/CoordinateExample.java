package tr0428;

import java.net.MulticastSocket;
import java.util.Scanner;

public class CoordinateExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표 : "); double x = sc.nextDouble();
		System.out.print("Y좌표 : "); double y = sc.nextDouble();
		
		
		Coordinate p = new Coordinate(x, y);
		System.out.println("p = (" + p.getX() +"," + p.getY() + ")");
		Coordinate q = p ;
		q.set(9.9, 9.9);
		System.out.println("p = (" + p.getX() + "," + p.getY() +")");
		System.out.println("q = (" + q.getX() + "," + q.getY() +")");
	}

}
