package tr0501;


public class Human4 {
	private static int counter = 0;
	private String name;
	private int height;
	private int weight;
	private int id;
	
	public Human4(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		id = ++counter;
	}
	public String getName() {
		return name;}
	public int getHeight() {
		return height;}
	public int getWeight() {
		return weight;}
	
	
	public void gainWeight(int w) {weight += w;}
	public void reduceWeight(int w) {weight -= w;}
	
	public int getId() {return id;}
	
	public void putData() {
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height + "cm");
		System.out.println("체중 : " + weight + "kg");
	}
}
