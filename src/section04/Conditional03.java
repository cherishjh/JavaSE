package section04;
/*
 * 1-3. if~else if~else
 * 	if(조건식1) {
 * 		조건식1	true일 때 실행명령문
 * } else if(조건식2) {
 * 		조건식2 true일때 실행명령문
 * } else {
 * 		조건식 1,2 모두 false 일떄 실행명령문
 * }
 * 
 */

public class Conditional03 {
	public static void main(String[] args) {
		double num = 13.5;
		if(num % 3 == 0) {
			System.out.println("num % 3 = 0");
		} else if(num % 3 == 1) {
			System.out.println("num % 3 = 1");
		} else if(num % 3 == 2) {
			System.out.println("num % 3 = 2");
		}else {
			System.out.println("num은 정수가 아닙니다."); //마지막  else 문은 뺴도 됨 ; 마지막 조건외에 실행이 안되게 하고 싶으면 
		}
	}
	
	
}