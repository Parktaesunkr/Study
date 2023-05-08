package tr0508;
//TriangleRB 클래스는 우하가 직각인 이등변 삼각형 클래스
public class TriangleRB extends AbstTriangle{

	public TriangleRB(int length) {
		super(length);
	}
	
	public String toString() {
		return "TriangleRB(length : "+ getLength() + ")";
	}
	
	public void draw() {
		for(int i = 1; i <= getLength(); i++) {
			for(int j =1; j <= getLength() -i; j++)
				System.out.print(' ');
			for(int j =1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
