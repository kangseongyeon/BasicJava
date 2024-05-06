package kr.or.ddit.study06.sec03;

public class Food {
	// 제조년
	int manuYear;
	int lastYear;
	String name;
	int price;

	// 기본 생성자
	public Food() {
		
	}
	
	// 파라미터
	// manuYear name price
	// lastYear 값은 입력 받은 제조년에서 3년 추가할 것
	public Food (int manuYear, String name, int price) {
		this.manuYear = manuYear;
		this.name = name;
		this.price = price;
		// 파라미터에 없는 값은 this 생략 가능
		lastYear = manuYear + 3;
		
	}

	@Override
	public String toString() {
		return "Food [manuYear=" + manuYear + ", lastYear=" + lastYear + ", name=" + name + ", price=" + price + "]";
	}
}