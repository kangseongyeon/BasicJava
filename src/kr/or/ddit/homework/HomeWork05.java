package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork05 obj = new HomeWork05();
		obj.process();
	}

	public void process() {
		method1();
		method2();
		method3();
		method4();
		method5();
		method6();
		method7();
		method8();
		method9();
		method10();
		method11();
	}
	
	public void method1() {
		/*
		 *    *
		 *    **
		 *    ***
		 *    ****
		 */
		System.out.print("숫자를 입력하세요.: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	public void method2() {
		/*
		 *         *
		 *        **
		 *       ***
		 *      ****
		 *     *****
		 *     # 힌트 * 앞에 공백 출력하기.
		 */
		
		System.out.print("숫자를 입력하세요.: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 선생님 풀이
//		System.out.print("숫자를 입력하세요.: ");
//		int row = sc.nextInt();
//		for (int i = 0; i < row; i++) {
//			for (int space = row - 1 - i; space > 0; space--) {
//				System.out.print(" ");
//			}
//			for (int start = 0; start < i + 1; start++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	

	public void method3() {
		/*
		 *     *****
		 *      ****
		 *       ***
		 *        **
		 *         *
		 */
		
		System.out.print("숫자를 입력하세요.: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = n; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 선생님 풀이
//		System.out.print("숫자를 입력하세요.: ");
//		int row = sc.nextInt();
//		for (int i = 0; i < row; i++) {
//			for (int space = 0; space < i; space++) {
//				System.out.print(" ");
//			}
//			
//			for (int star = 0; star < row - i; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	

	public void method4() {
		/*
		 *     *****
		 *     ****
		 *     ***
		 *     **
		 *     *
		 */
		
		System.out.print("숫자를 입력하세요.: ");
		int n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 선생님 풀이
//		System.out.print("숫자를 입력하세요.: ");
//		int row = sc.nextInt();
//		for (int i = 0; i < row; i++) {
//			for (int star = 0; star < row - i; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	

	public void method5() {
		/*
		 *         *
		 *        ***
		 *       *****
		 *      *******
		 *     *********
		 */
		
		System.out.print("숫자를 입력하세요.: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
		// 선생님 풀이
//		System.out.print("숫자를 입력하세요.: ");
//		int row = sc.nextInt();
//		
//		for (int i = 0; i < row; i++) {
//			for (int space = 0; space < row - i; space++) {
//				System.out.print(" ");
//			}
//			for (int star = 0; star < i * 2 + 1; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
	
	
	public void method6() {
		/*
		 *      
		 *     *********
		 *      *******
		 *       *****
		 *        ***
		 *         *
		 */
		System.out.print("숫자를 입력하세요.: ");
		int n = sc.nextInt();
		
		for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
		
			
	}

	
	public void method7() {
		/*
		 *      
		 *     ******
		 *     *    *
		 *     *    * 
		 *     *    *
		 *     *    * 
		 *     ******
		 */
		System.out.print("숫자를 입력하세요.: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i ==  1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	
	
	public void method8() {
		// 1  2  3  4  5
		// 6  7  8  9  10 
		// 11 12 13 14 15
		// 16 17 18 19 20 
		// 21 22 23 24 25 
		// 출력하기 
		for (int i = 1; i <= 25; i += 5) {
            for (int j = i; j < i + 5; j++) {
                System.out.print(j + "\t");
            }
            System.out.println(" ");
        }
	}
	
	
	public void method9() {
		// 1  6  11 16 20
		// 2  7  . 
		// 3 
		// 4 
		// 5  10       25
		// 출력하기 
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 25; j += 5) {
				System.out.print(j + "\t");
			}
			System.out.println(" ");
		}
	}

	
	public void method10() {
		// 1  10 11  20 21
		// 2  9  12  19	22
		// 3  8  13  18 23 
		// 4  7  14  17 24
		// 5  6  15  16 25
		// 출력하기 
		
		for (int h = 0; h < 5; h++) {
			for (int w = 0; w < 5; w++) {
				if (w%2 == 0) {
					System.out.print(1 + h + w * 5 + "\t");					
				} else {
					System.out.print(5 + w * 5 - h + "\t");
				}
			}
			System.out.println();
		}
	}
	
	
	public void method11() {
		// 1  2  3  4  5
		// 10 9  8  7  6	
		// 11 12 13 14 15  
		// 20 19 18 17 16
		// 21 22 23 24 25 
		// 출력하기 
		
		for (int h = 0; h < 5 ; h ++) {
            for (int w = 0; w < 5; w++) {
            	if (h %2 == 0) {            		
            		System.out.print(1 + w + h * 5 + "\t");
            	} else {
            		System.out.print(5 - w + h * 5 + "\t");
            	}
            }
            System.out.println(" ");
        }
	}
	
}
