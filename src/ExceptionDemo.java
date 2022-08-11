import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int second = sc.nextInt();
		try {
		System.out.printf("%d / %d = %d\n", first, second , (first/second));
		}catch(NullPointerException ex) {
			System.out.println("내가 잡았음");	
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(NegativeArraySizeException ex) {
			System.out.println(("NegativeArraySizeException"));
		}catch(RuntimeException ex){
			System.out.println("여기서 잡았음");
		}
		/*
		 * Multiple Catch Block : 여러개의 Exception Type을 열거하는 방법
		 * 		-주의할 점 : 위아래 순서가 있다. 위쪽은 자식 Exception, 아래쪾은 부모 Exception
		 */
	}
}
