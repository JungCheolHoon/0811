
public class WrapperClassDemo {				//프리미티브 타입 = 변수 즉 값 할당이 가능한 변수타입 ex) long, byte, int 등
	public static void main(String[] args) {
//		Until JDK 1.4
//		int age =26;		//stack
//		Integer in = new Integer(age);			//boxing, wrapping
//		int su = in.intValue();							//unboxing, unwrapping
//		System.out.println("su = " + su);
		
//		Since JDK 1.5
		Integer in = 26 + 5;							//Integer in = new Integer(26 + 5);	autoboxing
		int su = in + 100;							//in.intValue() + 100;
		System.out.println("su = " + su);
		in = su;
	}
}
