package tr0502;

import tr0501.Day;

public class Day2 {
	private int year = 1;
	private int month = 1;
	private int date = 1;
	
	
	public Day2() {}
	public Day2(int year) {
		this.year = year;}
	public Day2(int year, int month) {
		this(year);this.month = month;}
	public Day2(int year, int month, int date) {
		this(year,month);this.date = date;}
	public Day2(Day2 d) {this(d.year, d.month, d.date);}
	
	public int getYear() {return year;}
	public int getMonth() {return month;}
	public int getDate() {return date;}
	
	public void setYear(int year) {this.year = year;}
	public void setMonth(int month) {this.month = month;}
	public void setDate(int date) {this.date = date;}
	
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if(m ==1 || m == 2) {
			y--;
			m+=12;
		}
		return(y + y / 4 - y / 100 + y / 400 + ( 13 * m + 8 ) / 5 + date) % 7;
	}
	
	public boolean equalTo(Day2 d) {
		return year == d.year && month == d.month && date == d.date;
	}
	
	public String toString() {
		String[]wd = {"일","월","화","수","목","금","토"};
		return String.format("%04d년 %02d월 %02d일(%s)",
				year, month, date, wd[dayOfWeek()]);
	}
	
}
