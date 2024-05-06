package kr.or.ddit.study06.sec04;

public class Circle {
	// 값이 바뀌지 않는 경우에는 final (타입) (상수명 대문자)
	final double PI = Math.PI;
	
	// 반지름을 파라미터로 받고 원의 넓이를 구하시오
	// 넓이 = 3.14 * r * r
	// 메소드명 : area
	public double area(double r) {
		return PI * r * r;
	}

	// 반지름을 파라미터로 받고 원의 둘레를 구하시오
	// 넓이 = 2 * 3.14 * r
	// 메소드명 : circumference
	public double circumference(double r) {
		return 2 * PI * r;
	}
}
