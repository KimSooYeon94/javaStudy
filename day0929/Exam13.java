import java.util.Scanner;
class Exam13 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c, d;
		System.out.print("AC�� �Է��ϼ��� : ");
		a = sc.nextDouble();
		System.out.print("AE�� �Է��ϼ��� : ");
		b = sc.nextDouble();
		System.out.print("BC�� �Է��ϼ��� : ");
		c = sc.nextDouble();

		d = b * c / a;

		System.out.print("DE��" + d + "�Դϴ�");


	}
}
