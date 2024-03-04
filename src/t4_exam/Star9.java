package t4_exam;

import java.util.Scanner;

/*
		 *
    ***
   *****
	*******
 *********
  *******
	 *****
	  ***
	   *
*/ //중간별의 개수를 입력, 증가별, 감소별, 홀수별(짝수를 입렵받아도 홀수로) 2n+1 2n-1
public class Star9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요? ");
		int half = sc.nextInt();

		for(int i=1; i<=half; i++) {
			for(int j=1; j<=half-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=half-1; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(half-i)*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
