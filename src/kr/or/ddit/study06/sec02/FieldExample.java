package kr.or.ddit.study06.sec02;

public class FieldExample {
	// field : class 영역에 있는 변수
	String name;
	int age;

	public static void main(String[] args) {
		FieldExample f1 = new FieldExample();
		// 객체 : f1 & f2
		// 각각 별개의 값들을 담아 줌
		f1.name = "이름1";
		f1.age = 20;

		FieldExample f2 = new FieldExample();
		f2.name = "이름2";
		f2.age = 25;

	}
}
