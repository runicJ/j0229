package t4_exam;
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
public class Star8 {
	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
