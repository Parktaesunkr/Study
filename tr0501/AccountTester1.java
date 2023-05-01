package tr0501;

public class AccountTester1 {

	public static void main(String[] args) {
		Day d = new Day(2010, 10, 15);
		Account2 gildong = new Account2("길동", "125768", 100, d);
		
		Day p = gildong.getOpenDay();
		System.out.println("계좌 개설일 : " + p);
		
		p.set(1999, 12, 31);
		
		Day q = gildong.getOpenDay();
		System.out.println("개좌 개설일 : " + q);
	}

}
