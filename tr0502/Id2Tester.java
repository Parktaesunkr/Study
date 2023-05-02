package tr0502;

public class Id2Tester {

	public static void main(String[] args) {
		Id2 a = new Id2();
		Id2 b = new Id2();
		
		System.out.println("a의 식별 변호 : " + a.getId());
		System.out.println("b의 식별 변호 : " + b.getId());
		
		System.out.println("마지막으로 붕한 식별 변호 = " + Id2.getMaxId());
		System.out.println("마지막으로 붕한 식별 변호 = " + a.getMaxId());
		System.out.println("마지막으로 붕한 식별 변호 = " + b.getMaxId());
		

	}

}
