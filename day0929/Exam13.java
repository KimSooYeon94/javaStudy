import java.util.Scanner;
class Exam13 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c, d;
		System.out.print("AC를 입력하세요 : ");
		a = sc.nextDouble();
		System.out.print("AE를 입력하세요 : ");
		b = sc.nextDouble();
		System.out.print("BC를 입력하세요 : ");
		c = sc.nextDouble();

		d = b * c / a;

		System.out.print("DE는" + d + "입니다");


	}
}
