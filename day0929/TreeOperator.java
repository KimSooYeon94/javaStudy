import java.util.Scanner;
class TreeOperator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		String res;
		System.out.print("���ڸ� �Է��ϼ��� => ");
		n = sc.nextInt();
		res = (n%2==0)?"¦��":"Ȧ��";
		System.out.print(n + "�� " + res +"�Դϴ�.");

		
	}
}
