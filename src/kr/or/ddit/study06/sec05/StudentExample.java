package kr.or.ddit.study06.sec05;

public class StudentExample {
	// 정적 멤버 : static 존재 (값이 정해짐)
	static int a = 10;
	// 인스턴스 멤버 : 객체가 만들어져야 사용 가능
	int b = 20;
	
	public static void main(String[] args) {
		Student s1 = new Student("김민강", 20);
		s1.age = 24;
		s1.year++;
		
		Student s2 = new Student("서지윤", 20);
		
		System.out.println(Student.year +" "  + s1.toString());
		System.out.println(Student.year +" "  + s2.toString());
		
		
		StudentExample se = new StudentExample();
		int b = se.b;
		System.out.println(b);
	}
}
