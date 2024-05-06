package kr.or.ddit.study07.sec01;

public class IPhone extends SmartPhone{
	public void apstore() {
		System.out.println("앱 스토어 사용");
	}
	
	// Override : 부모 클래스에서 이미 개발 되어 있다
	@Override
	public void camera() {
		// TODO Auto-generated method stub
		
		System.out.println("1000만 화소 카메라");
		// 부모 : super
		// 부모에 있는 카메라를 사용한다.
		super.camera();
	}

	
}
