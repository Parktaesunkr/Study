package tr0502;

public class Id2 {
	private static int counter = 0;
	private int id;
	public Id2() {
		this.id = ++counter;
	}
	public int getId() {return id;}
	
	public static int getMaxId() {
		return counter;
	}
}
