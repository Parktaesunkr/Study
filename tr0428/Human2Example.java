// 클래스 이용
package tr0428;

public class Human2Example {

	public static void main(String[] args) {
	Human2 gildong = new Human2("길동",170,60);
	Human2 chulsu = new Human2("철수",166,72);
	
	gildong.gainWeight(3);
	chulsu.reduceWeight(5);
	
	System.out.println("이름 :" + gildong.getName());
	System.out.println("신장 :" + gildong.getHeight() + "cm");
	System.out.println("체중 :" + gildong.getWeight() + "kg");
	System.out.println();
	
	System.out.println("이름 :" + chulsu.getName());
	System.out.println("신장 :" + chulsu.getHeight() + "cm");
	System.out.println("체중 :" + chulsu.getWeight() + "kg");
	System.out.println();
	
	}

}
