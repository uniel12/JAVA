package calculator;

public class Rectangle extends Figure {
	
	// 필드
	private double width;
	private double height;
	
	// 생성자 메소드
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	// 한 클래스 내에 있으므로 getter메소드 필요 없음

	//사각형 넓이 계산해주는 메소드
	@Override
	public double calArea() {
		return width*height;
	}
	
	
	
	
	
}
