package kr.or.ddit.study07.sec01;

//IPhone2 클래스 만들고 IPhone 상속 받기
// camera 2000만 화소 업그레이드 하기
	public class IPhone2 extends SmartPhone {
		@Override
		public void camera() {
			// TODO Auto-generated method stub
			System.out.println("2000만 화소 카메라");
			super.camera();
		}
	}
	