/*package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
		obj.method1();
		obj.mehtod2();
		obj.mehtod3();
		obj.mehtod4();
		obj.mehtod5();
	}
	
	public void method1() {
		
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 버림  
		 *  ex ) 12.23123 - > 12.23
		 
		System.out.println("실수 를 입력해주세요.");
		String str = sc.next();
		
		double num = Double.parseDouble(str);
		
		double result = (int)(num * 100) / 100.0;
		
		System.out.println(str + "->" + result);
		
		
	}
	
	public void mehtod2() {
		
		 *  스캐너를 통해서 대문자를 입력 받고 소문자로 변환 
		 *  ex) A-> a  
		 
		System.out.println("대문자를 입력 해주세요.");
		String s = sc.next();
		
		char text = s.charAt(0);
		
		int change = (int)text + 32;
		
		System.out.println(s + "->" + (char)change);
	}
	
	
	public void mehtod3() {
		
		 *  스캐너를 통해서 소문자를 입력 받고 대문자로 변환 
		 *  ex) f-> F  
		 
		System.out.println("소문자를 입력 해주세요.");
		String s = sc.next();
		
		char text = s.charAt(0);
		int change = (int)text - 32;
		
		System.out.println(s + "->" + (char)change);
	}
	
	public void mehtod4() {
		
		 *  스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오
		 *  ex) 123 -> 1+2+3
		 
		System.out.println("세자리 숫자를 입력해주세요.");
		String s = sc.next();
		
		char num1 = s.charAt(0);
		char num2 = s.charAt(1);
		char num3 = s.charAt(2);
		
		int s1 = Character.getNumericValue(num1);
		int s2 = Character.getNumericValue(num2);
		int s3 = Character.getNumericValue(num3);
		
		int sum = s1 + s2 + s3;
		
		System.out.println(sum);
	}
	
	public void mehtod5() {
		
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 반올림  
		 *  ex ) 12.2623 - > 12.3
		 
		
		System.out.println("숫자를 입력해주세요.");
		String num = sc.next();
		
		double num1 = (Double.parseDouble(num)) * 100;
		int num2 = (int) num1 + 5;
		double result = num2 / 100.0;
		int num3 = (int)(result * 10);
		double result2 = num3 / 10.0;
		
		
		System.out.println(result2);		
	}
	
	
}
*/

package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
//		obj.method1();
//		obj.mehtod2();
//		obj.mehtod3();
		obj.mehtod4();
		obj.mehtod5();
//	}/

	public void method1() {
		/*
		 * 스캐너를 통해서 문자(실수)를 입력 받고. 소수점 2째 짜리에서 버림 ex ) 12.23123 - > 12.23
		 */
		System.out.println("실수 를 입력해주세요.");
		String str = sc.next();

		double num = Double.valueOf(str);

		int num100 = (int) (num * 100);
		double result =num100 / 100.0; 

		System.out.println(str + "->" + result);
	}

	public void mehtod2() {
		/*
		 * 스캐너를 통해서 대문자를 입력 받고 소문자로 변환 ex) A-> a
		 */
		System.out.println("대문자를 입력 해주세요.");
		String s = sc.next();

		char text = (char)(s.charAt(0) + 32);

		System.out.println(s + "->" + text);
	}

	public void mehtod3() {
		/*
		 * 스캐너를 통해서 소문자를 입력 받고 대문자로 변환 ex) f-> F
		 */
		System.out.println("소문자를 입력 해주세요.");
		String s = sc.next();

		char text = (char)(s.charAt(0) - 32);

		System.out.println(s + "->" + text);
	}

	public void mehtod4() {
		/*
		 * 스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오 ex) 123 -> 1+2+3
		 */
		System.out.println("세자리 숫자를 입력해주세요.");
		String s = sc.next();

		char num1 = s.charAt(0);
		char num2 = s.charAt(1);
		char num3 = s.charAt(2);
		
		int i1 = num1 - '0';
		int i2 = num2 - '0';
		int i3 = num3 - '0';
		System.out.println(i1 + i2 + i3);
	}

	public void mehtod5() {
		/*
		 * 스캐너를 통해서 문자(실수)를 입력 받고. 소수점 2째 짜리에서 반올림 ex ) 12.2623 - > 12.3
		 */

		System.out.println("숫자를 입력해주세요.");
		String num = sc.next();

		double num1 = (Double.parseDouble(num)) * 100;
		int num2 = (int) num1 + 5;
		double result = num2 / 100.0;
		int num3 = (int) (result * 10);
		double result2 = num3 / 10.0;

		System.out.println(result2);
	}

}
