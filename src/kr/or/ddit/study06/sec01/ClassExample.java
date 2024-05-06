package kr.or.ddit.study06.sec01;

import kr.or.ddit.homework.HomeWork08;

public class ClassExample {
	// 클래스 구성요소
	// 1. 필드
	// 변수로 선언한 것
	// 데이터를 담아주는 역할
	// 클래스에 있는 변수들 (메소드 안에 있는 변수들은 필드라고 하지 않음)
	int a;
	int b = 10;
	
	// 2. method 
	
	// 메인 메소드
	// 메인 : 클래스가 시작하는 시작점
	// 클래스에서 동작을 담당
	public static void main (String[] args) {
		
	}
	
	// 테스트 메소드
	public void test() {
		
	}
	
	// 3. 생성자
	// new 키워드와 함께 사용
	// ex) HomeWork08 obj = new HomeWork08();
	// 기본 생성자
	// 클래스 이름을 그래도 사용
	public ClassExample() {
		
	}
	
	// 생성자
	public ClassExample(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
