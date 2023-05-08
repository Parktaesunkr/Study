package tr0508;
// TriangleLB 클래스는 좌하가 직각인 이등변 삼각형 클래스
public class TriangleLB extends AbstTriangle{

	public TriangleLB(int length) {
		super(length);
	}
	
	public String toString() {
		return "TriangleLB(length : "+ getLength() + ")";
	}
	
	public void draw() {
		for(int i = 1; i <= getLength(); i++) {
			for(int j =1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
