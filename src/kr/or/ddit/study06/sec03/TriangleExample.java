package kr.or.ddit.study06.sec03;

public class TriangleExample {
	public static void main(String[] args) {
//		Point p1 = new Point(0,0);
//		new Point (10,0); 

//		int ran = new Random().nextInt(10);

		Point p1 = new Point(0, 0);
		Triangle t1 = new Triangle(p1, new Point(10, 0), new Point(0, 10));
		System.out.println(t1);
		System.out.println("넓이은 : " + t1.area);
		Triangle t2 = new Triangle (0, 0, 10, 0, 0, 10);
		System.out.println(t2);
		System.out.println("넓이은 : " + t2.area);
	}
}