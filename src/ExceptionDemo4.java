import java.util.Scanner;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");	int kor = sc.nextInt();
		System.out.print("수학 점수 : ");	int math = sc.nextInt();
		Student std;
		try {
			std = new Student(kor , math);
			System.out.println(std);
		} catch (KoreanException e) {
			System.out.println(e.getMessage());
		} catch (MathException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

class Student {
	private int kor, math;

	public Student(int kor, int math) throws KoreanException, MathException  {		//퍼가는 사용자가 알아보기 위한 라벨 같은 느낌
		if(kor >=0 && kor<=100) this.kor = kor;
		else throw new KoreanException("국어점수는 0부터 100점까지여야 합니다");
		if(math >=0 && math <=100) this.math = math;
		else throw new MathException("수학점수는 0부터 100점까지여야 합니다");
	}

	@Override
	public String toString() {
		return String.format("Student [kor=%s, math=%s]", kor, math);
	}
}