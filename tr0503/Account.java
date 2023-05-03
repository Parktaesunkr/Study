package tr0503;

public class Account {

	private static int counter = 0;
	
	private String name;
	private String no;
	private long balance;
	private Day openDay;
	private int id;
	
	{
		id = ++counter;
		System.out.println("은행 계좌를 개설해주셔서 감사합니다.");
	}

	public Account(String name, String no) {
		
		this(name, no, 0, new Day());
		
	}

	public Account(String name, String no, long balance, Day openDay) {
		this.name = name;
		this.no = no;
		this.balance = balance;
		this.openDay = new Day(openDay);
	}

	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public long getBalance() {
		return balance;
	}

	public Day getOpenDay() {
		return new Day(openDay);
	}

	public int getId() {
		return id;
	}
	
	void deposit(long k) {
		balance -= k;
	}
	
	public String toString() {
		return "{" + name + "," + no + ","+ balance+ "}";
	}
	
	
	
	
	
}
