import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/*
 *	Java에서 날짜 / 시간을 처리하는 6가지 방법
 *	1. java.util.Date class
 *	2. java.util.Calendar class
 *	3. java.text.DateFormat class
 *	4. java.text.SimpleDateFormat class
 *	5. printf()
 */
public class UtilityClassDemo {
	public static void main(String[] args) {
		Date now = new Date();
//		System.out.println(now.getTime());		//1660199912431
//		File file = new File("C:/Temp/sungjuk_utf8.dat");
//		long last = file.lastModified();								//마지막 수정 시간
//		System.out.println(last);
//		Date crateTime = new Date();
//		System.out.println(crateTime.toString());
//		Date before = new Date(1660199912431L);
//		System.out.println(before);
//		Calendar today1 = new GregorianCalendar();
//		Calendar today = Calendar.getInstance();
//		int year = today.get(Calendar.YEAR);
//		int month = today.get(Calendar.MONTH)+1;
//		int day = today.get(Calendar.DATE);
//		int day1 = today1.get(Calendar.DAY_OF_MONTH);
//		int day = today.get(Calendar.DAY_OF_MONTH);
//		System.out.println(year+"년 " + month + "월 " + day +"일");
//		
//		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,Locale.FRANCE);
//		System.out.println(df.format(new Date() )) ;
//		
		String pattern = "오늘은 yyyy년 MM월 dd일 입니다.";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); 
		System.out.println(sdf.format(new Date()) );
//		
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다.\n",new Date());			//new Date로 Date클래스 생성시 주소값을 지정하면 그 주소에 현재 시간을 밀리세컨드로 리턴되어 저장되고, 주소를 지정하지 않으면 일시적으로 현재시간이 리턴되어 시간생성
	}
}
