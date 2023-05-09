package tr0509;

public class Reactangle implements Plane2D{
	
	private int width;
	private int height;
	
	
	public Reactangle(int width, int height) {
			this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return "Rectangle(width :" + width + ", height : " + height+")";
	}
	
	public void draw() {
		for(int i = 0; i <= height; i++) {
			for(int j = 0; j <= width; j++)
				System.out.print('*');
			System.out.println();
		}
	}
	public int getArea() {return width*height;}

}
