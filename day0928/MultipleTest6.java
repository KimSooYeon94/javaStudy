import java.util.Scanner;
class  MultipleTest6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N;
        System.out.print("������ �� N�� �Է��ϼ���==> ");
		N = sc.nextInt();
		
		boolean flag;
		flag = N % 6 == 0;
		System.out.println(flag);

	}
}
