import java.util.Scanner;
class AgeTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("ù��° ����� ���̸� �Է��ϼ��� =>");
		a = sc.nextInt();
		System.out.print("�ι�° ����� ���̸� �Է��ϼ��� =>");
		b = sc.nextInt();

		if( a == b )
		System.out.print("�� ����� ���̴� �����ϴ�.");
		else
		System.out.print("�� ����� ���̴� �ٸ��ϴ�.");


	}
}
