// 식별 번호 클래스 시작 번호를 오늘 날짜로
package id;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class DateId {
	
	private static int counter;
	private int id;
	
	static {
		GregorianCalendar today = new GregorianCalendar();
		int y = today.get(YEAR);
		int m = today.get(MONTH);
		int d = today.get(DATE);
		
		System.out.printf("오늘은 %04d년 %02d월 %02d일입니다.\n",y,m,d);
		
		counter = y *100000 + m*10000+ d * 100;
	}

	public DateId() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}
	
	

}
