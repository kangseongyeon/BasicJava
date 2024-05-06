package kr.or.ddit.study06.sec03;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student("강성연", 23);
		System.out.println(s1);
		
		Student s2 = new Student("305호", "이채민", 25);
		System.out.println(s2);
		
		Student s3 = new Student("미국", "406호", "노아", 25);
		System.out.println(s3);
	}
}