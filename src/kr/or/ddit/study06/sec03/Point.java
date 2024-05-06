package kr.or.ddit.study06.sec03;

public class Point {
	int x, y;
	
	// 기본 생성자 생성 x
	// why? point 점을 의미할 때 좌표가 반드시 필요함 
	// -> 기본정보가 반드시 필요한 클래스
	
	
	// 생성자 x y 파라미터로
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}