import java.util.Scanner;
class StudentTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math, avg;
		System.out.print("�л��� �̸��� �Է��ϼ���=>");
		name = sc.next();
		System.out.print("���� ������ �Է��ϼ���=>");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���=>");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���=>");
		math = sc.nextInt();
		
		avg = (kor + eng + math)/3;
		
		System.out.println();
		System.out.println("**��� ���**");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("��� : " + (double)avg);

		if(kor>=90 && (double)avg >=90)
			System.out.println(name + " �л��� ���б��� ���� �� �ֽ��ϴ�.");
		else
			System.out.println(name + " �л��� ���б��� ���� �� �����ϴ�.");

	}
}