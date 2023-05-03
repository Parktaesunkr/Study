package tr0503;

import java.util.Scanner;

public class DayTester {
	static Scanner sc = new Scanner(System.in);
	
	static void display(Day day) {
		System.out.println(day + "에 관한 정보");
		System.out.println("윤년" + (day.isLeap() ? "입니다" : "이 아닙니다."));
		System.out.println("연도 내 경과 일수 : " + day.dayOfYear());
		System.out.println("연도 내 잔여 일수 : " + day.leftDayOfYear());
	}
	
	static void change(Day day) {
		System.out.println("[1]연월일을 변경 [2]연을 변경");
		System.out.println("[3]월을 변경 [4]일을 변경");
		System.out.println("[5]1일 뒤 [6]1일 앞");
		System.out.println("[7]n일 뒤 [8]n일 앞 : ");
		
		int change = sc.nextInt();
		int y = 0, m = 0, d = 0, n = 0;
		if(change == 1 || change == 2) {
			System.out.println("연 : "); y = sc.nextInt();
		}
		if(change == 1 || change == 3) {
			System.out.println("월 : "); m = sc.nextInt();
		}
		if(change == 1 || change == 4) {
			System.out.println("일 : "); d = sc.nextInt();
		}
		if(change == 7 || change == 8) {
			System.out.println("며칠 : "); n = sc.nextInt();
		}
		
		switch(change) {
		case 1 : day.set(y, m, d); break;
		case 2 : day.setYear(y);; break;
		case 3 : day.setMonth(m);; break;
		case 4 : day.setDate(d);; break;
		case 5 : day.succeed();; break;
		case 6 : day.precede();; break;
		case 7 : day.succeedDays(n);; break;
		case 8 : day.precedeDays(n);; break;
		}
		System.out.println(day + "로 변경됐습니다.");
	}
	static void compare(Day day) {
		System.out.println("비교 대상 날짜를 입력하자.");
		System.out.print("연 : "); int y =sc.nextInt();
		System.out.print("월 : "); int m =sc.nextInt();
		System.out.print("일 : "); int d =sc.nextInt();
		
		Day d2 = new Day(y, m, d);
		
		int comp = day.compareTo(d2);
		System.out.print(day);
		
		switch(comp) {
		case -1 : System.out.println("가 앞"); break;
		case 1 : System.out.println("가 뒤"); break;
		case 0 : System.out.println("와 같다."); break;
		}
	}
	
	
	static void beforeAfter(Day day) {
		System.out.print("[1]내일 [2]어제 [3]n일 후 [4]n일 전 : ");
		int type = sc.nextInt();
		int n = 0;
		if(type == 3 || type == 4) {
			System.out.print("며칠 : ");
			n = sc.nextInt();
		}
		
		System.out.print("이 날은");
		switch(type) {
		case 1 : System.out.print(day.succeedingDay());break;
		case 2 : System.out.print(day.precedingDay());break;
		case 3 : System.out.print(day.after(n));break;
		case 4 : System.out.print(day.before(n));break;
		}
		System.out.println("입니다.");
	}
	
	public static void main(String[] args) {
		System.out.println("날짜를 입력하세요.");
		System.out.print("연 : "); int y =sc.nextInt();
		System.out.print("월 : "); int m =sc.nextInt();
		System.out.print("일 : "); int d =sc.nextInt();
		
		Day day = new Day(y, m, d);
		
		while(true) {
			System.out.print("[1]날짜 관련 정보 표시 [2]날짜 변경 [3]다른 날짜와 비교\n"+
		"[4]전후 날짜 [5]종료 :");
			
			int menu = sc.nextInt();
			if(menu == 5) break;
			
			switch(menu) {
			case 1 : display(day); break;
			case 2 : change(day); break;
			case 3 : compare(day); break;
			case 4 : beforeAfter(day); break;
			}
		}
	}

}
