package t1_while;

// 무한 loop
public class Test3_1 {
	public static void main(String[] args) {
		byte i = 0;  // -128 ~ 127
		
		while(true) {
			i++;
			System.out.println(i + "안녕");  // 127이상 -128부터
			
		}
	}
}
