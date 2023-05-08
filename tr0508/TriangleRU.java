package tr0508;
//TriangleRU 클래스는 우상이 직각인 이등변 삼각형 클래스
public class TriangleRU extends AbstTriangle{

	public TriangleRU(int length) {
		super(length);
	}
	public String toString() {
		return "TriangleRU(length : "+ getLength() + ")";
	}
	
	public void draw() {
		for(int i = getLength(); i >= 1; i--) {
			for(int j =1; j <= getLength() - i; j++)
				System.out.print(' ');
			for(int j =1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
