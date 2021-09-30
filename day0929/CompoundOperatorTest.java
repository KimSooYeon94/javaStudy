import java.util.Scanner;
class CompoundOperatorTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i, n;
		int sum = 0;

		System.out.print("1부터 어떤 수까지 더할까요? => ");
		n = sc.nextInt();
		
		for( i = 1 ; i <= n ; i++ ){
			sum += i;
		}

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
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
