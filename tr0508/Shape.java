package tr0508;
/*
 * Shape 클래스는 도형의 개념을 나타내기 위한 추상 클래스이다.
 * 추상 클래스이므로 이 클래스의 인스턴스를 생성할 수 없다.
 * 구체적인 도형 클래스는 이 클래스로부터 파생된다.
 * @author 시바타
 * @see Object
 */

public abstract class Shape {
	/*
	 * 도형 정보를 나타내는 문자열을 반환하는 추상 메소드이다.
	 * Shape 클래스에서 파생되는 클래스에서 이 메소드를 구현한다,
	 * 이 베소드는 java.lang.object클래스의 메소드를 추상 메소드로
	 * 오버라이드한 메소드이다
	 */
	public abstract String toString();
	
	/*
	 * draw 메소드는 도형을 그리기 위한 추상 메소드이다.
	 * Shape 클래스에서 파생되는 클래스에서 이 메소드를 구현한다.
	 */
	
	public abstract void draw();
	/*
	 * print 메소드는 도형 정보의 표시하고 도형 자체를 그린다.
	 * 구체적으로는 다음 두 단계를 따른다.
	 * Step1. toString 메소드가 반환하는 문자열을 표시하고 줄 바꿈
	 * Step2. draw 메소드를 호출해서 도형을 그림
	 */
	
	public void print() {
		System.out.println(toString());
		draw();
	}
	
}
