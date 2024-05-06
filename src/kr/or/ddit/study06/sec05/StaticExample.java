package kr.or.ddit.study06.sec05;

public class StaticExample {
	// static : 메소드 영역에 있음
	// 메소드 : 힙 영역에 있음 -> 객체를 만들었을 때 생김
	
	// static ; 객체를 만들지 않고도 바로 메소드 영역에 생김
	int a = 10;
	static int b = 10;
	
	// 
	public void mehtod1() {
		
	}
	
	// a를 부를 수 있음
	public void method2() {
		
	}
	
	// b 값을 부를 수 있음
	// static 영역에서는 a를 불러올 수 없음
	public static void method3() {
		
	}
	
	public static void method4() {
		
	}
}
