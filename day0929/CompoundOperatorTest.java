import java.util.Scanner;
class CompoundOperatorTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i, n;
		int sum = 0;

		System.out.print("1���� � ������ ���ұ��? => ");
		n = sc.nextInt();
		
		for( i = 1 ; i <= n ; i++ ){
			sum += i;
		}

		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
		
		/*
		sum += i;

		i++;
		sum += i;
		
		i++;
		sum += i;

		System.out.println(i);
		System.out.println(sum);
		*/
	}
}
