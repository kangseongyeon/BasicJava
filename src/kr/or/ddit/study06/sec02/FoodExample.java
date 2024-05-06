package kr.or.ddit.study06.sec02;

public class FoodExample {
	public static void main(String[] args) {
		// 객체 2개 생성 후 적절한 값을 넣어보시오
		
		Food food1 = new Food();
		food1.name = "초코짱";
		food1.price = 300;
		
		Food food2 = new Food();
		food2.name = "다이제";
		food2.price = 1500;
		
//		System.out.println("제조일자 : " + food1.year + "\t" + "이름 : " + food1.name + "\t" + "가격: " + food1.price);
//		System.out.println("제조일자 : " + food2.year + "\t" +"이름 : " + food2.name + "\t" + "가격: " + food2.price);
		
		System.out.println(food1);
		System.out.println(food2);
	}
}