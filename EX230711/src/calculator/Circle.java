package calculator;

public class Circle extends Figure {

	// 필드 
	private double radius;

	// 생성자 메소드
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	// 원의 넓이를 계산해주는 메소드
	@Override
	public double calArea() {
		return radius*radius*3.14;
	}
	
	
}
