/*
 * 	Method's Override 조건 3가지
 * 	1. 이름, 리턴타입, 괄호가 같아야 한다.
 *  2. 메소드의 접근제한자는 부모보다 같거나 넓어야 한다.				/Override는 다형성으로 결국 부모의 주소에서 아들의 메소드를 사용하기 위함이므로 더 넓어야함
 *  3.	자식의 Exception은 부모의 Exception 보다 더 좁아야 한다.		/마찬가지.
 *  
 */
public class Lion extends Mammal {

	@Override
	public void saySomething() {
		// TODO Auto-generated method stub

	}

}
