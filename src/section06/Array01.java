package section06;
/*
 * 배열 
 * 다수의 데이터를 저장하고 처리하기 위해 사용하는 데이터 표현 방법
 * 여러 개의 데이터를 하나의 묶음으로 관리할 수 있다
 * 변수의 갯수를 줄일 수 있다
 */
/* int num1 = 1;
int num1 = 2;
int num1 = 3;
를 하나로 묶을 수 있음 이게  array
*/


public class Array01 {
	public static void main(String[] args) {
		// 정수 10개를 담을 수 있는 배열객체 생성
		int[] nums = new int[10];
		
		// 실수 10개를 담을 수 있는 배열객체 생성
		double[] nums2=new double[10];
		
		//문자열 10개를 담을 수 있는 배열객체 생성
		String str [] = new String[10];  //대괄호는 어디에 쓰든 상관 없음, 자바는 보통 타입 선언 후에 []
		
		System.out.println(nums);
		System.out.println(nums2);
		System.out.println(str);
	
	}
}
