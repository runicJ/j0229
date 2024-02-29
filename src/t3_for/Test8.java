package t3_for;

// 중첩 반복문(for) = 바깥쪽 수행횟수 * 안쪽 수행횟수
public class Test8 {
	public static void main(String[] args) {  // void는 리턴값이 없는 것
		int cnt = 0;
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt + " , i = "+i+", j = " + j);
				
				// 앞의 문장을 6번 수행 후 탈출시키고자 한다.
				if(cnt == 6) return;  // 현재 메소드 탈출  // 나머지 내용이 남아있더라도 수행
			}
			System.out.println();
		}
		System.out.println("작업끝...");
	}
}
