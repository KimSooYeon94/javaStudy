import java.util.Scanner;
class  MultipleTest6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N;
        System.out.print("임의의 수 N을 입력하세요==> ");
		N = sc.nextInt();
		
		boolean flag;
		flag = N % 6 == 0;
		System.out.println(flag);

	}
}
