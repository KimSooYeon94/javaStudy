import java.util.Scanner;
class StudentAvgTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math, avg;
		System.out.print("학생의 이름을 입력하세요 ==> ");
		name = sc.next();
		System.out.print("국어 점수를 입력하세요 ==> ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 ==> ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 ==> ");
		math = sc.nextInt();
		
		avg = (kor + eng + math)/3;

		if (avg >=60)
		System.out.println(name +" 학생은 평균이 " + (double)avg + "점으로 합격입니다.");
		else
		System.out.println(name +" 학생은 평균이 " + (double)avg + "점으로 불합격입니다.");



	}
}
