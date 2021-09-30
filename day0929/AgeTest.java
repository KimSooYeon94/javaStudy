import java.util.Scanner;
class AgeTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("첫번째 사람의 나이를 입력하세요 =>");
		a = sc.nextInt();
		System.out.print("두번째 사람의 나이를 입력하세요 =>");
		b = sc.nextInt();

		if( a == b )
		System.out.print("두 사람의 나이는 같습니다.");
		else
		System.out.print("두 사람의 나이는 다릅니다.");


	}
}
