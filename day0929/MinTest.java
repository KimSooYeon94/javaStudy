import java.util.Scanner;
class MinTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,min;
		System.out.print("ù��° ������ �Է��ϼ��� ==> ");
		a = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� ==> ");
		b = sc.nextInt();
		
		if (a>=b)
			min = b;
		else
			min = a;
        System.out.print("�� �� ���� ������ " + min + " �Դϴ�.");
			
	}
}
