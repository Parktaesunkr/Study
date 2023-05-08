package tr0508;
//TriangleLU 클래스는 좌상이 직각인 이등변 삼각형 클래스
public class TriangleLU extends AbstTriangle{

	public TriangleLU(int length) {
		super(length);
	}
	
	public String toString() {
		return "TriangleLU(length : "+ getLength() + ")";
	}
	
	public void draw() {
		for(int i = getLength(); i>=1; i--) {
			for(int j =1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	
	}

}
