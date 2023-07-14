package section02;

import java.util.Scanner;

/*
 * Scanner: 사용자로부터 데이터를 읽기 위해 사용되는 클래스
 *  Scaneer 클래스를 사용하면 키보드로부터 텍스트나 숫자를 읽을 수 있다. \
 *  ??????????????????????????키보드?
 *  
 * 
 * 
 */
public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//시스템에서 input을 받겠다 -> consol에서 값을 받겠다
		String name, address;	// 문자열 값을 담는 변수  변수 선언! 변수는 값을 담을 수 있는 그릇 -  String 은 문자열을 받을 수 있고 name, address는 변수 선언을 함 (문자열을 받는 변수)=변수명
		int age;             	// 정수 값을 담는 변수 : int - 정수값을 받음
		double weight;			// 실수 값을 담는 변수: double - 프로그램에서 =는 값을 넣는 것 (정의하는 것?)
		
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요.");
		name = scanner.next( ); 			// name = "한희준"
		address = scanner.next(); 			// address = "광명"
		age = scanner.nextInt(); 			// age = 29
		weight = scanner.nextDouble(); 		// weight = 56
		
		System.out.printf("당신의 이름은 %s입니다.\n",name);
		System.out.printf("당신의 주소는 %s입니다.\n",address);
		System.out.printf("당신의 나이는 %d입니다.\n",age);
		System.out.printf("당신의 체중은 %.1fkg입니다.\n",weight);
		
	}
}


















