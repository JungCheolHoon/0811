import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) throws FileNotFoundException {			//예외처리가 무조건 필요한 메소드가 포함되어 있어 메인에서 날려줘야함 빨간줄만 없어짐 남이 나의 메소드를 쓸때 알려주기 위해 사용
//		File file = new File("C:/Temp/sungjuk_utf8.dat");
//		try {
//			Scanner sc = new Scanner(file, "utf-8");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		System.out.print("숫자형 글자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int su = 0;
		try {
			su = Integer.parseInt(num) ;
		}
		catch(NumberFormatException ex){
			System.out.println(ex);
		}
		System.out.printf("su = %d\n", su);
		
	}
}
