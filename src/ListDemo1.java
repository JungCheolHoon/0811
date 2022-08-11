import java.util.Vector;

public class ListDemo1 {
	public static void main(String[] args) {
		Vector <String> vector = new Vector<String>();		//()안에 아무것도 안넣으면 기본 10공간 이후 늘어날때마다 10공간 증가 (2,1) 초기 저장량2 , 공간 증가량1
		System.out.print(vector.capacity() + ", \t");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", \t");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", \t");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", \t");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", \t");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", \t");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", \t");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", \t");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", \t");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", \t");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", \t");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", \t");
		System.out.println(vector.size());
		
	}
}
