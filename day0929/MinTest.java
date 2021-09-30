import java.util.Scanner;
class MinTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b,min;
		System.out.print("첫번째 정수를 입력하세요 ==> ");
		a = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 ==> ");
		b = sc.nextInt();
		
		if (a>=b)
			min = b;
		else
			min = a;
        System.out.print("둘 중 작은 정수는 " + min + " 입니다.");
			
	}
}
