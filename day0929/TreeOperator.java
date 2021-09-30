import java.util.Scanner;
class TreeOperator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		String res;
		System.out.print("숫자를 입력하세요 => ");
		n = sc.nextInt();
		res = (n%2==0)?"짝수":"홀수";
		System.out.print(n + "은 " + res +"입니다.");

		
	}
}
