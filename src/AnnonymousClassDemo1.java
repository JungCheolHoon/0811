
public class AnnonymousClassDemo1 {
	public static void main(String[] args) {
		AnnonymousClassDemo1 acd = new AnnonymousClassDemo1();
//		acd.exec(acd.new MyClass());
//		AnnonymousClassDemo1.MyClass asd = acd.new MyClass();
//		acd.exec(asd);
//		acd.exec(acd.new MyMulitple());
		acd.exec(new MyInterface() {			//익명클래스 : 주소를 가지지 않고 메소드 실행시에만 잠깐 만들어지는 클래스
			@Override
			public int calculate(int a, int b) {
				return a+b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a-b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a*b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a/b;
			}
		});
		
	}
	void exec(MyInterface mi) {					//member method
		int result = mi.calculate(5, 9);
		System.out.println("result = " + result);
	}
	
//	class MyMulitple implements MyInterface{
//		@Override
//		public int calculate(int front, int back) {
//			return front * back;
//		}
//	}
//	class MyClass implements MyInterface{	//member class
//		@Override
//		public int calculate(int front, int back) {
//			return front + back;
//		}
//	}
}

@FunctionalInterface
interface MyInterface{
	int calculate(int front, int back);
}