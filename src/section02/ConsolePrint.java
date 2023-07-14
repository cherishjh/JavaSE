package section02;
/*	/*  여기의 중괄호는 코드 블럭
	 * 진짜 코드의 시작은 밑 main
	 */
	/*출력문
	 * 데이터를 화면에 출력하는 방법
	 * 
	 * system.out.println(): 괄호안 내용 출력 후 행 바꿈
	 * system.out.print(): 괄호안 내용 출력 후 행 X
	 * system.out.printf(): 문자열 서식 문자를 이용해 형식화된 내용 출력 행 바꿈 X
	 * 
	 * 서식 문자
	 * 	%d: :  정수(10진수)
	 *	%o  :  정수 (8진수)
	 *	%x  :  정수(16진수)
	 *	%f  :  실수
	 *	%e 	:  지수(e표기 기반)
	 *	%g  :  출력 대상에 따라 %e, %f 형태로 출력
	 *	%s  :  믄지열
	 *  %c  :  문자
	 *  
	 *  main method: 코드가 실행되는 지점 
	 */

public class ConsolePrint {
	public static void main(String[] args) {
		System.out.print("Welcome.");
		
		System.out.println("Java World");
		
		System.out.printf("오늘은 %d월 %d일 입니다.\n",7,14);
		
		/* /n의 뜻?
		 * 
		 * 사용자 입력 값이 들어갈 수 있게 하고 싶으면 %d 부분을 변경하면 됨 (사용자 입력값이 무엇인지 모르기 때문)
		 * 
		 * 
		 */
		System.out.printf("%d은 첫번째, %f는 두번째, %s은 세번째.\n", 1,2.0, "셋");
		/*문자열과 문자의 차이? 
		 * (바꿔보니 안됨 (%s->%c)
		 * 
		 */

}
	
}
