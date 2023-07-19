package section05;
/*
 * 중첨 for 문
 * 	for 문 안에 for 문
 * 
 */

public class Loop04 {
	public static void main(String[] args) {
		/*i=0
		 * 	j=0~6
		 * 
		 * 
		 */
		for(int i = 0 ; i < 7; i++) {
			for(int j = 0 ; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
}
