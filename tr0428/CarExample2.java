package tr0428;

import java.util.Scanner;

public class CarExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("차량 데이터를 입력하세요.");
		System.out.print("이  름 : "); String name = sc.next();
		System.out.print("번  호 : "); String number = sc.next();
		System.out.print("전  폭 : "); int width = sc.nextInt();
		System.out.print("전  고 : "); int  height = sc.nextInt();
		System.out.print("전  장 : "); int  length = sc.nextInt();
		System.out.print("탱크용량 : "); double tank = sc.nextDouble();
		System.out.print("연료량 : "); double fuel = sc.nextDouble();
		System.out.print("연  비: "); double sfc = sc.nextDouble();
		
		Car myCar = new Car(name,number,width,height,length,tank,fuel,sfc);
		
		while(true) {
			System.out.printf("현재 위치 :(%.2f,%.2f)\n", myCar.getX(), myCar.getY());
			System.out.printf("남은 연료 : %.2f\n", myCar.getFuel());
			System.out.print("이동하겠습니까?[0...no/1...yes]:");
			if(sc.nextInt()==0) break;
			
			System.out.print("X방향의 이동 거리 : ");
			double dx = sc.nextDouble();
			System.out.print("Y방향의 이동 거리 : ");
			double dy = sc.nextDouble();
			
			if(!myCar.move(dx, dy))
				System.out.println("연료 부족!!");
		}

	}

}
