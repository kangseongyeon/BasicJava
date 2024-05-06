package kr.or.ddit.study06.sec02;

public class Food {
	// 제조일자
	String year = "2024.02.20";
	String name;
	int price;

	{
		year = "2024.04.01";
	}
	
	
//	@Override
//	public String toString() {
//		return "제조일자 : " + year + "\t" + "이름 : " + name + "\t" + "가격 : " + price;
// 	}
	
	@Override
	// alt + shift + s => Generate toString => Generate
	public String toString() {
		return "Food [year=" + year + ", name=" + name + ", price=" + price + "]";
	}
}