import java.util.Scanner;
class StudentTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math, avg;
		System.out.print("학생의 이름을 입력하세요=>");
		name = sc.next();
		System.out.print("국어 점수를 입력하세요=>");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요=>");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요=>");
		math = sc.nextInt();
		
		avg = (kor + eng + math)/3;
		
		System.out.println();
		System.out.println("**결과 출력**");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("평균 : " + (double)avg);

		if(kor>=90 && (double)avg >=90)
			System.out.println(name + " 학생은 장학금을 받을 수 있습니다.");
		else
			System.out.println(name + " 학생은 장학금을 받을 수 없습니다.");

	}
}
