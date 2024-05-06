package kr.or.ddit.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HomeWork17 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork17 obj = new HomeWork17();
		obj.process();
	}

	public void process() {
		while (true) {
			System.out.println("1. 회원 가입.");
			System.out.println("2. 회원 탈퇴.");
			System.out.println("3. 정보 수정.");
			System.out.println("4. 회원 전체 정보 출력.");
			int sel = sc.nextInt();
			if (sel == 1) {
				addMember();
			}
			if (sel == 2) {
				removeMember();
			}
			if (sel == 3) {
				updateMember();
			}
			if (sel == 4) {
				printMemberList();
			}
		}
	}

	int cur = 0;
	Member[] memList = new Member[100];

	public void addMember() {
		// id 입력시 4~8자 입력 받을것.
		String id;
		while (true) {
			System.out.print("아이디를 입력해주세요 : ");
			id = sc.next();
			try {
				idCheck(id);
				break;
			} catch (Exception e) {
				System.out.println("4~8자를 입력해주세요");
			}
		}

		// pass 입력시 4~ 8자 입력
		String pass;
		while (true) {
			System.out.print("패스워드를 입력해주세요 : ");
			pass = sc.next();
			try {
				passCheck(pass);
				break;
			} catch (Exception e) {
				System.out.println("4~8자를 입력해주세요");
			}
		}

		// name 입력시 2~5자 입력
		String name;
		while (true) {
			System.out.print("이름을 입력해주세요 : ");
			name = sc.next();
			try {
				nameCheck(name);
				break;
			} catch (Exception e) {
				System.out.println("2~5자를 입력해주세요");
			}
		}

		// nickName 2~8자 입력시 욕설등 금지어 체크 -> contains
		String nickName;
		while (true) {
			System.out.print("닉네임을 입력해주세요 : ");
			nickName = sc.next();
			try {
				nickNameCheck(nickName);
				break;
			} catch (Exception e) {
				System.out.println("욕설을 제외한 2~8자를 입력해주세요");
			}
		}

		// age 숫자 입력 체크
		int age;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("나이를 입력해주세요: ");
			try {
				age = sc.nextInt();
				ageCheck(age);
				break;
			} catch (InputMismatchException e) {
				System.out.println("나이는 숫자여야 합니다.");
			} catch (Exception e) {
				System.out.println("다시 입력해주세요");
			}
		}

		Member mem = new Member();
		mem.setId(id);
		mem.setPass(pass);
		mem.setName(name);
		mem.setNickName(nickName);
		mem.setAge(age);
		memList[cur++] = mem;
		printMemberList();
	}

	public void idCheck(String id) throws Exception {
		if (id.length() < 4 || id.length() > 8) {
			throw new Exception();
		}
	}

	public void passCheck(String pass) throws Exception {
		if (pass.length() < 4 || pass.length() > 8) {
			throw new Exception();
		}
	}

	public void nameCheck(String name) throws Exception {
		if (name.length() < 2 || name.length() > 5) {
			throw new Exception();
		}
	}

	public void nickNameCheck(String nickName) throws Exception {
		if (nickName.length() < 2 || nickName.length() > 5) {
			throw new Exception();
		}

		if (nickName.contains("미친")) {
			throw new Exception();
		}
	}

	public void ageCheck(int age) throws Exception {
		if (age <= 0) {
			throw new Exception();
		}
	}

	public void removeMember() {
		Member[] temp = new Member[100];
		printMemberList();
		System.out.print("삭제할 회원번호를 입력하세요. : ");
		int num = sc.nextInt();
		int add = 0;
		for (int i = 0; i < cur; i++) {
			if (i == num)
				add++;
			temp[i] = memList[i + add];
		}
		memList = temp;
		cur--;
		printMemberList();
	}

	public void printMemberList() {
		for (int i = 0; i < cur; i++) {
			System.out.println("아이디\t비밀번호\t이름\t나이");
			Member mem = memList[i];
			System.out.println(mem.getId() + "\t" + mem.getPass() + "\t" + mem.getName() + "\t" + mem.getAge());
		}
	}

	public void updateMember() {
		printMemberList();

		System.out.print("수정할 회원 번호 입력: ");
		int num = sc.nextInt();
		Member mem = memList[num - 1];

		String id;
		while (true) {
			System.out.print("아이디를 입력해주세요 : ");
			id = sc.next();
			try {
				idCheck(id);
				break;
			} catch (Exception e) {
				System.out.println("4~8자를 입력해주세요");
			}
		}

		// pass 입력시 4~ 8자 입력
		String pass;
		while (true) {
			System.out.print("패스워드를 입력해주세요 : ");
			pass = sc.next();
			try {
				passCheck(pass);
				break;
			} catch (Exception e) {
				System.out.println("4~8자를 입력해주세요");
			}
		}

		// name 입력시 2~5자 입력
		String name;
		while (true) {
			System.out.print("이름을 입력해주세요 : ");
			name = sc.next();
			try {
				nameCheck(name);
				break;
			} catch (Exception e) {
				System.out.println("2~5자를 입력해주세요");
			}
		}

		// nickName 2~8자 입력시 욕설등 금지어 체크 -> contains
		String nickName;
		while (true) {
			System.out.print("닉네임을 입력해주세요 : ");
			nickName = sc.next();
			try {
				nickNameCheck(nickName);
				break;
			} catch (Exception e) {
				System.out.println("욕설을 제외한 2~8자를 입력해주세요");
			}
		}

		// age 숫자 입력 체크
		int age;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("나이를 입력해주세요: ");
			try {
				age = sc.nextInt();
				ageCheck(age);
				break;
			} catch (InputMismatchException e) {
				System.out.println("나이는 숫자여야 합니다.");
			} catch (Exception e) {
				System.out.println("다시 입력해주세요");
			}
		}

		mem.setId(id);
		mem.setPass(pass);
		mem.setName(name);
		mem.setNickName(nickName);
		mem.setAge(age);
		memList[num - 1] = mem;
	}

}

class Member {
	private String id;
	private String pass;
	private String name;
	private String nickName;
	private int age;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
