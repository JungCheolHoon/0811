/*
 * 	사용자 정의형 Exception
 * 	1. 누구의 자식인가 ? RuntimeException 계열인가? 아닌가? checked or unchecked
 *	2. 생성자를 잘 만들자. (메시지 전달 / Runtime메소드중 하나인 getmessage로 msg호출
 *
 *	KoreanException은 RuntimeException 의 subclass --> unchecked Exception
 */
public class KoreanException extends RuntimeException {
	 public KoreanException(String msg) {
		 super(msg);
	 }

	 
}
