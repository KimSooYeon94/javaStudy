import java.util.Scanner;
class StudentAvgTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math, avg;
		System.out.print("�л��� �̸��� �Է��ϼ��� ==> ");
		name = sc.next();
		System.out.print("���� ������ �Է��ϼ��� ==> ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� ==> ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� ==> ");
		math = sc.nextInt();
		
		avg = (kor + eng + math)/3;

		if (avg >=60)
		System.out.println(name +" �л��� ����� " + (double)avg + "������ �հ��Դϴ�.");
		else
		System.out.println(name +" �л��� ����� " + (double)avg + "������ ���հ��Դϴ�.");



	}
}
