/*
 * 	1. close()는 반드시 파일을 열거나 DB를 열었을 때 처리해야 한다.
 *	2. 그러기 위해서 finally 블록에 close()를 사용한다.
 *	3. 하지만 finally 블록의 코드가 너무 길어지기 떄문에
 *	4. Autocloseable 인터페이스의 자식들은 finally안에 close() 를 할 필요가 없기 때문에
 *	   finally block은 사용하지 않아도 된다.
 *	5. 이때 try block이 모두 끝나면 자동으로 해당 객체의 close()가 일어난다. 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo5 {
	public static void main(String[] args) {
//		BufferedReader br = null;
		 String line = null;
		 try (
			BufferedReader br = new BufferedReader(new FileReader("C:/Temp/sungjuk_utf8.dat"));
		 ){
			 while((line = br.readLine()) != null) {
				 System.out.println(line);
			 }
		 }
		 catch(IOException ex){
			 System.out.println(ex);
		 }
//		 finally{				// try catch 중 주로 파일 닫을때 쓰는 것 허나 버퍼드리더는 오토클로즈 인터페이스 내의 메소드므로 자동으로 닫히며 객체는 자동으로 소멸되게 해야함
//			 try {
//				if(br!=null) br.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		 }
		 
	}
}
