import java.util.Scanner;
class ThreeTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, min;
		
		System.out.print("첫번째 정수를 입력하세요 => ");
		a = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 => ");
		b = sc.nextInt();
        min = (a>b)?b:a;
		
		System.out.println("두 수중에 작은 정수는 " + min + "입니다.");

			
	}
}
