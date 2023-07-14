package section02;

/* 
 * 2. 문자형 (char)
 * 문자 한 글자 저장 가능- 전 세계 쓰이는 대부분 문자 표현 가능
 * 2 byte
 * 
 * 선언 방법 
 * char 변수명;
 * 
 * 변수 초기화 
 * 	변수를 사용하기 전 값을 처음 할당하는 것을 의미한다.
 * 		
 * 
 * 
 * 
 * 
 */
public class Variable02 {
	public static void main(String[] args) {
		// char 형 변수선언 및 대입 
		char ch1 = 'A';  //char은 문자 선언할 떄 "" 아닌 ''로 선언		
		System.out.println("char 형 변수에 저장된 문자: :" +ch1);
		
		char ch2, ch3;
		ch2 = '金';
		ch3 = '膃';
		System.out.println("ch2 저장된 문자:" + ch2);
		System.out.println("ch3 저장된 문자:" + ch3);
		
		int num = ch1;		// char ch1 변수를 int 정수형으로 형변환 
		System.out.println("대문자 A에 해당하는 숫자코드:" + num);
		
		char ch4 = 66;
		System.out.println("숫자 66에 해당하는 문자코드: " + ch4);
		
		char ch5 = 'c';
		System.out.println("char 형 변수에 저장된 문자:" + ch5);
		int num2 = ch5;
		System.out.println("소문자 c에 해당하는 숫자코드: " + num2);
		
	}
}
