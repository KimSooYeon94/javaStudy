import java.util.Scanner;
class Exam03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double pound, result;
		System.out.print("몸무게(파운드)를 입력하세요 => ");
		pound = sc.nextDouble();

		result = 454 * pound;

		System.out.println("몸무게(파운드)를 환산하면 " + result + "그램입니다.");


	}
}
