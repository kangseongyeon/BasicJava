package kr.or.ddit.study06.sec05;

public class BigLoad {
	private static BigLoad instance;

	public BigLoad() {
		try {
			// 3초동안 멈춘다
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static BigLoad getInstance() {
		if (instance == null) {
			instance = new BigLoad();
		}
		return instance;
	}
}
