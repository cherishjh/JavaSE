package section05;
/*
 * 제어문
 * 반복문
 * 	특정한 부분의 코드가 반복적으로 수행도리 수 있도록 하는 명령어
 * 
 * 	1. while 문
 * 		while(조건식) {
 * 			반복 수행할 코드
 * 		}
 * break 문
 * 		반복문에서 break 문은 반복문을 즉시 종료하는 명령어
 * 
 * continue 문
 * 		반복문에서 해당 반복을 건너뛰고 다음 반복을 실행하도록 강제하는 명령어 
 * 
 */
public class Loop01 {
  public static void main(String[] args) {
	  // while문을 이용하여 0~99까지 출력
	 
	 /* int count=0;
	  while(count<100) {
		  System.out.println(count);
		  count++; //++: count 변수에 1을 더해줌 
		  }
	  	*/	
	  
	/*  int count = 0;
	  boolean isRun = true;
      while(isRun) {
    	  System.out.println(count);
    	  count++;
    	  if(count == 100)
    		  isRun = false;
      }
      */
	  
	 /* int count = 0;
	  while(true) {
    	  System.out.println(count);
    	  count++;
    	  if(count == 100)
    		  break;
		}
	  	*/
	  
	  int i = 0;
		while(i < 100) {
			i++;
			
			if(i % 3 == 0)
				continue;
				System.out.println(i);
			}
		}
  }


  
