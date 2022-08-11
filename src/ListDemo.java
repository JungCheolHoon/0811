import java.util.List;
import java.util.Stack;

/*
 * 	Stack : LIFO (Last Input First Out)
 */
public class ListDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack <String>();
//		List <String> list = new<String>();
		String [] array = {"박지민" , "홍지민" , "박지민" , "한지민", "한지민", "이지민"};
		for(String str : array) {
			stack.push(str);
		}
//		System.out.println(stack);
//		System.out.println(stack.search("한지민"));								//stack의 제일 위층부터 1번째 중복된 데이터도 같이 넣음 / 데이터 없으면 -1 반환
//		System.out.println(stack.size());
//		System.out.println(stack);
//		System.out.println(stack.pop());											//마지막에 넣은 데이터가 빠짐 --> 데이터를 쌓는 형식	--> 데이터 삭제
//		System.out.println(stack.size());
//		System.out.println(stack);
//		System.out.println(stack.peek());											//peak는 데이터는 남아있으며 제일 위에 있는 데이터를 출력
//		System.out.println(stack.size());
		
		while(stack.empty()==false) {												//stack.empty() 스택이 비었으면 true를 반환
			System.out.println(stack.size());
			stack.pop();
			
		}
		
	}
}
