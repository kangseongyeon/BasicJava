package kr.or.ddit.study07.sec02.tell;

// abstract (추상 메소드)  : 메소드에 구현할 내용이 없을 경우
//						: 안에 내용은 실제 구현되지 않음 -> 끝에 ; 사용
// 						: 자식 메소드는 꼭 내용이 있어야 함
public abstract class Schedular {
	abstract public void getNextCall();

	abstract public void sendCallToAgent();
}
