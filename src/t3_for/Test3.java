package t3_for;

/*
	for(int i=초기값; 조건식; 증감치) {
		조건을 만족할때 수행처리할 내용...
 */
public class Test3 {
	public static void main(String[] args) {
		// 조건을 만족하면 해당 조건만큼만 처리할 내용을 수행한다.
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			i--;  // 함부로 변수 제어하면x. 목적을 생각해야함.
		}
		System.out.println("작업끝..");
	}
}
