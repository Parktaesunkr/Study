package tr0501;

public class Human4Tester {

	public static void main(String[] args) {
		Human4 gildong = new Human4("홍길동", 170, 60);
		Human4 chulsu = new Human4("김철수", 166, 72);
		
		gildong.putData();
		System.out.println("번호 : " + gildong.getId());
		
		System.out.println();
		
		chulsu.putData();
		System.out.println("번호 : " + chulsu.getId());

	}

}
